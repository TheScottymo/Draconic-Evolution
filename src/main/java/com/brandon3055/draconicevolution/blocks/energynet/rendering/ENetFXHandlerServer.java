package com.brandon3055.draconicevolution.blocks.energynet.rendering;

import com.brandon3055.draconicevolution.blocks.energynet.tileentity.TileCrystalBase;
import com.brandon3055.draconicevolution.network.CrystalUpdateBatcher;
import com.brandon3055.draconicevolution.network.CrystalUpdateBatcher.BatchedCrystalUpdate;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraftforge.fml.common.FMLCommonHandler;
import net.minecraftforge.fml.common.network.NetworkRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by brandon3055 on 29/11/2016.
 */
public class ENetFXHandlerServer extends ENetFXHandler {

    private BatchedCrystalUpdate batchedUpdate;
    private Map<Byte, Byte> lastTickIndexToFlow = new HashMap<>();
    private int lastTickEnergy = -1;


    public ENetFXHandlerServer(TileCrystalBase tile) {
        super(tile);
    }

    @Override
    public void update() {}

    @Override
    public void detectAndSendChanges() {
        BatchedCrystalUpdate update = new BatchedCrystalUpdate(tile.getIDHash(), tile.getEnergyStored());
        for (byte i = 0; i < tile.flowRates.size(); i++) {
            byte flow = tile.flowRates.get(i);

            if (!lastTickIndexToFlow.containsKey(i) || lastTickIndexToFlow.get(i) != flow) {
                update.indexToFlowMap.put(i, flow);
                lastTickIndexToFlow.put(i, flow);
            }

            if (update.indexToFlowMap.size() > 0 || Math.abs(lastTickEnergy - tile.getEnergyStored()) > 100) {
                lastTickEnergy = tile.getEnergyStored();
                batchedUpdate = update;
            }
        }

        if (batchedUpdate != null) {
            sendUpdate();
        }
    }

    @Override
    public void reloadConnections() {
        lastTickIndexToFlow.clear();
    }

    private void sendUpdate() {
        NetworkRegistry.TargetPoint tp = tile.syncRange();

        for (EntityPlayerMP player : FMLCommonHandler.instance().getMinecraftServerInstance().getPlayerList().getPlayerList()) {
            if (player.dimension == tp.dimension) {
                double d4 = tp.x - player.posX;
                double d5 = tp.y - player.posY;
                double d6 = tp.z - player.posZ;

                if (d4 * d4 + d5 * d5 + d6 * d6 < tp.range * tp.range) {
                    CrystalUpdateBatcher.queData(batchedUpdate, player);
                }
            }
        }

        batchedUpdate = null;
    }
}
