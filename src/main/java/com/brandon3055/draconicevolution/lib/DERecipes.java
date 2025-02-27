package com.brandon3055.draconicevolution.lib;

import com.brandon3055.draconicevolution.DEFeatures;
import com.brandon3055.draconicevolution.items.ToolUpgrade;
import com.brandon3055.draconicevolution.items.tools.RecipeDislocatorClone;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

import static com.brandon3055.draconicevolution.DEFeatures.*;
import static com.brandon3055.draconicevolution.lib.RecipeManager.RecipeDifficulty.*;
import static com.brandon3055.draconicevolution.lib.RecipeManager.*;
import static net.minecraft.init.Blocks.*;
import static net.minecraft.init.Items.*;
import static net.minecraft.init.Items.SKULL;

/**
 * Created by brandon3055 on 23/07/2016.
 */
public class DERecipes {

    public static void addRecipes() {

        /* ------------------ Blocks ------------------ */

        //region Simple Blocks
        addFusion(NORMAL, new ItemStack(draconicBlock, 4), new ItemStack(draconiumBlock, 4), 50000000, 1, draconicCore, draconicCore, draconicCore, dragonHeart, draconicCore, draconicCore, draconicCore);
        addFusion(HARD, new ItemStack(draconicBlock, 4), new ItemStack(draconiumBlock, 4), 100000000, 1, wyvernCore, wyvernCore, wyvernCore, dragonHeart, wyvernCore, wyvernCore, wyvernCore);

        //endregion

        //region Machines
        addShaped(ALL, generator, "ABA", "BCB", "ADA", 'A', "ingotBrickNether", 'B', "ingotIron", 'C', FURNACE, 'D', draconicCore);
        addShaped(NORMAL, grinder, "ABA", "CDC", "AEA", 'A', "ingotIron", 'B', "ingotDraconium", 'C', DIAMOND_SWORD, 'D', draconicCore, 'E', FURNACE);
        addShaped(HARD, grinder, "ABA", "CDC", "AEA", 'A', "ingotIron", 'B', "ingotDraconium", 'C', wyvernSword, 'D', draconicCore, 'E', FURNACE);
        addShaped(NORMAL, energyInfuser, "ABA", "CDC", "ACA", 'A', "ingotDraconium", 'B', new ItemStack(particleGenerator, 1, 2), 'C', draconicCore, 'D', ENCHANTING_TABLE);
        addShaped(HARD, energyInfuser, "ABA", "CDC", "AEA", 'A', "ingotDraconium", 'B', new ItemStack(particleGenerator, 1, 2), 'C', wyvernCore, 'D', ENCHANTING_TABLE, 'E', draconicCore);
        addShaped(ALL, new ItemStack(particleGenerator, 1, 0), "ABA", "BCB", "ABA", 'A', "blockRedstone", 'B', BLAZE_ROD, 'C', draconicCore);
        addShaped(NORMAL, new ItemStack(particleGenerator, 1, 2), "A A", " B ", "A A", 'A', "gemDiamond", 'B', new ItemStack(particleGenerator, 1, 0));
        addFusion(HARD, new ItemStack(particleGenerator, 1, 2), new ItemStack(particleGenerator), 80000, 1, "gemDiamond", wyvernCore, "gemDiamond", wyvernCore, "gemDiamond", "gemDiamond");
        addShaped(NORMAL, infusedObsidian, "ABA", "BCB", "ABA", 'A', BLAZE_POWDER, 'B', "obsidian", 'C', "dustDraconium");
        addFusion(HARD, new ItemStack(infusedObsidian), new ItemStack(OBSIDIAN), 32000, 1, "dustDraconium", "ingotDraconium", "gemDiamond", "ingotDraconium", "dustDraconium", "dustDraconium", BLAZE_POWDER, "gemDiamond", BLAZE_POWDER, "dustDraconium");
        addShaped(NORMAL, dislocatorReceptacle, "ABA", " C ", "A A", 'A', "ingotIron", 'B', draconicCore, 'C', infusedObsidian);
        addShaped(HARD, dislocatorReceptacle, "ABA", " C ", "A A", 'A', "ingotIron", 'B', wyvernCore, 'C', infusedObsidian);
        addShaped(ALL, dislocatorPedestal, " A ", " B ", "CDC", 'A', STONE_PRESSURE_PLATE, 'B', "stone", 'C', STONE_SLAB, 'D', BLAZE_POWDER);
        addShaped(NORMAL, energyStorageCore, "AAA", "BCB", "AAA", 'A', "ingotDraconium", 'B', wyvernEnergyCore, 'C', wyvernCore);
        addShaped(HARD, energyStorageCore, "AAA", "BCB", "AAA", 'A', "ingotDraconiumAwakened", 'B', draconicEnergyCore, 'C', awakenedCore);
        addShaped(NORMAL, new ItemStack(energyPylon, 2), "ABA", "CDC", "AEA", 'A', "ingotDraconium", 'B', ENDER_EYE, 'C', "gemEmerald", 'D', draconicCore, 'E', "gemDiamond");
        addShaped(HARD, new ItemStack(energyPylon, 2), "ABA", "CDC", "AEA", 'A', "ingotDraconium", 'B', ENDER_EYE, 'C', "gemEmerald", 'D', wyvernCore, 'E', "gemDiamond");
        addShaped(ALL, rainSensor, " A ", "BCB", "DDD", 'A', BUCKET, 'B', "dustRedstone", 'C', STONE_PRESSURE_PLATE, 'D', STONE_SLAB);
        addShaped(ALL, dissEnchanter, "ABA", "CDC", "EEE", 'A', "gemEmerald", 'B', draconicCore, 'C', ENCHANTED_BOOK, 'D', ENCHANTING_TABLE, 'E', BOOKSHELF);
        addShaped(NORMAL, celestialManipulator, "ABA", "CDC", "EFE", 'A', "blockRedstone", 'B', CLOCK, 'C', "ingotDraconium", 'D', DRAGON_EGG, 'E', "ingotIron", 'F', wyvernCore);
        addShaped(HARD, celestialManipulator, "ABA", "CDC", "EFE", 'A', "blockRedstone", 'B', CLOCK, 'C', "ingotDraconiumAwakened", 'D', DRAGON_EGG, 'E', "ingotIron", 'F', awakenedCore);
        addShaped(ALL, potentiometer, " A ", "BCB", "DDD", 'A', "plankWood", 'B', "dustRedstone", 'C', "dustDraconium", 'D', STONE_SLAB);
        addShaped(ALL, entityDetector, "ABA", "CDC", "EFE", 'A', new ItemStack(DYE, 1, 4), 'B', ENDER_EYE, 'C', "dustRedstone", 'D', "ingotDraconium", 'E', "ingotIron", 'F', draconicCore);
        addShaped(ALL, new ItemStack(entityDetector, 1, 1), "ABA", "CDC", "EFE", 'A', "blockRedstone", 'B', new ItemStack(SKULL, 1, 1), 'C', "blockLapis", 'D', "gemDiamond", 'E', "ingotDraconium", 'F', entityDetector);

        //Fusion Crafting Blocks
        addShaped(NORMAL, fusionCraftingCore, "ABA", "BCB", "ABA", 'A', "blockLapis", 'B', "gemDiamond", 'C', draconicCore);
        addShaped(HARD, fusionCraftingCore, "ABA", "BCB", "ABA", 'A', "blockLapis", 'B', "netherStar", 'C', draconicCore);
        addShaped(NORMAL, craftingPedestal, "ABA", "CDC", "CCC", 'A', "gemDiamond", 'B', draconicCore, 'C', "stone", 'D', "blockIron");
        addShaped(HARD, craftingPedestal, "ABA", "CDC", "ECE", 'A', "gemDiamond", 'B', draconicCore, 'C', "blockDraconium", 'D', "blockIron", 'E', "stone");
        addFusion(NORMAL, new ItemStack(craftingPedestal, 1, 1), new ItemStack(craftingPedestal), 32000, 0, wyvernCore, "gemDiamond", draconicCore, "gemDiamond", draconicCore, "gemDiamond", "blockDraconium", "gemDiamond");
        addFusion(HARD, new ItemStack(craftingPedestal, 1, 1), new ItemStack(craftingPedestal), 256000, 0, wyvernCore, "netherStar", draconicCore, "netherStar", draconicCore, "netherStar", "blockDraconium", "netherStar");
        addFusion(NORMAL, new ItemStack(craftingPedestal, 1, 2), new ItemStack(craftingPedestal, 1, 1), 256000, 1, "gemDiamond", "gemDiamond", wyvernCore, "blockDraconiumAwakened", wyvernCore, "gemDiamond", "gemDiamond");
        addFusion(HARD, new ItemStack(craftingPedestal, 1, 2), new ItemStack(craftingPedestal, 1, 1), 1000000, 1, "netherStar", "netherStar", wyvernCore, "blockDraconiumAwakened", wyvernCore, "netherStar", "netherStar", DRAGON_EGG);
        addFusion(NORMAL, new ItemStack(craftingPedestal, 1, 3), new ItemStack(craftingPedestal, 1, 2), 8000000, 2, "gemDiamond", "gemDiamond", chaoticCore, DRAGON_EGG, "gemDiamond", "gemDiamond");
        addFusion(HARD, new ItemStack(craftingPedestal, 1, 3), new ItemStack(craftingPedestal, 1, 2), 23000000, 2, "netherStar", "netherStar", chaoticCore, DRAGON_EGG, chaoticCore, "netherStar", "netherStar", chaosShard);

        //endregion

        //region Advanced Machines

        //endregion

        //region Exotic Blocks

        //endregion

	    /* ------------------ Items ------------------ */

        //region Crafting Components / Base items
        //Nuggets, Ingots, Blocks and Shards
        addShapeless(ALL, new ItemStack(nugget, 9), "ingotDraconium");                          //Ingots to Nuggets
        addShapeless(ALL, new ItemStack(nugget, 9, 1), "ingotDraconiumAwakened");
        addShaped(ALL, draconiumIngot, "AAA", "AAA", "AAA", 'A', "nuggetDraconium");            //Nuggets to Ingots
        addShaped(ALL, draconicIngot, "AAA", "AAA", "AAA", 'A', new ItemStack(nugget, 1, 1));
        addShaped(ALL, draconiumBlock, "AAA", "AAA", "AAA", 'A', "ingotDraconium");             //Ingots to Blocks
        addShaped(ALL, draconicBlock, "AAA", "AAA", "AAA", 'A', "ingotDraconiumAwakened");
        addShapeless(ALL, new ItemStack(draconiumIngot, 9), "blockDraconium");                  //Blocks to Ingots
        addShapeless(ALL, new ItemStack(draconicIngot, 9), "blockDraconiumAwakened");
        addShaped(ALL, new ItemStack(chaosShard, 1, 2), "AAA", "AAA", "AAA", 'A', new ItemStack(chaosShard, 1, 3));
        addShaped(ALL, new ItemStack(chaosShard, 1, 1), "AAA", "AAA", "AAA", 'A', new ItemStack(chaosShard, 1, 2));
        addShaped(ALL, chaosShard, "AAA", "AAA", "AAA", 'A', new ItemStack(chaosShard, 1, 1));
        //Cores
        addShaped(ALL, draconicCore, "ABA", "BCB", "ABA", 'A', "ingotDraconium", 'B', "ingotGold", 'C', "gemDiamond");
        //addShaped(HARD, draconicCore, "ABA", "BCB", "ABA", 'A', "ingotDraconium", 'B', "gemDiamond", 'C', "netherStar");
        addShaped(NORMAL, wyvernCore, "ABA", "BCB", "ABA", 'A', "ingotDraconium", 'B', draconicCore, 'C', "netherStar");
        addFusion(HARD, new ItemStack(wyvernCore), new ItemStack(EMERALD_BLOCK), 1000000, 0, draconicCore, draconicCore, "blockDraconium", "netherStar", draconicCore, "netherStar", "blockDraconium", draconicCore, draconicCore);
        addFusion(NORMAL, new ItemStack(awakenedCore), new ItemStack(NETHER_STAR), 1000000, 1, wyvernCore, wyvernCore, "ingotDraconiumAwakened", "ingotDraconiumAwakened", "ingotDraconiumAwakened", "ingotDraconiumAwakened", "ingotDraconiumAwakened", wyvernCore, wyvernCore);
        addFusion(HARD, new ItemStack(awakenedCore), new ItemStack(NETHER_STAR), 10000000, 1, wyvernCore, wyvernCore, "blockDraconiumAwakened", "blockDraconiumAwakened", wyvernCore, "blockDraconiumAwakened", "blockDraconiumAwakened", wyvernCore, wyvernCore);
        addFusion(NORMAL, new ItemStack(chaoticCore), new ItemStack(chaosShard), 100000000, 2, "ingotDraconiumAwakened", "ingotDraconiumAwakened", awakenedCore, awakenedCore, "ingotDraconiumAwakened", awakenedCore, awakenedCore, "ingotDraconiumAwakened");
        addFusion(HARD, new ItemStack(chaoticCore), new ItemStack(chaosShard), 100000000, 2, chaosShard, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened", "blockDraconiumAwakened", awakenedCore, chaosShard, chaosShard, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened", "blockDraconiumAwakened", awakenedCore, chaosShard);
        //energy Cores
        addShaped(NORMAL, wyvernEnergyCore, "ABA", "BCB", "ABA", 'A', "ingotDraconium", 'B', "blockRedstone", 'C', draconicCore);
        addShaped(HARD, wyvernEnergyCore, "ABA", "BCB", "ABA", 'A', "blockDraconium", 'B', "blockRedstone", 'C', draconicCore);
        addShaped(NORMAL, draconicEnergyCore, "ABA", "BCB", "ABA", 'A', "ingotDraconiumAwakened", 'B', wyvernEnergyCore, 'C', wyvernCore);
        addFusion(HARD, new ItemStack(draconicEnergyCore), new ItemStack(wyvernEnergyCore), 10000000, 2, "ingotDraconiumAwakened", "ingotDraconiumAwakened", awakenedCore, "ingotDraconiumAwakened", "ingotDraconiumAwakened", "blockRedstone", "blockRedstone", "blockRedstone", "blockRedstone", "blockRedstone");
        //endregion

        //region Tools
        //Wyvern
        addShaped(NORMAL, wyvernPick, " A ", "BCB", " D ", 'A', wyvernCore, 'B', "ingotDraconium", 'C', DIAMOND_PICKAXE, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernPick, "ABA", "CDC", "AEA", 'A', "netherStar", 'B', wyvernCore, 'C', "blockDraconium", 'D', DIAMOND_PICKAXE, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernShovel, " A ", "BCB", " D ", 'A', wyvernCore, 'B', "ingotDraconium", 'C', DIAMOND_SHOVEL, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernShovel, "ABA", "CDC", "AEA", 'A', "netherStar", 'B', wyvernCore, 'C', "blockDraconium", 'D', DIAMOND_SHOVEL, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernAxe, " A ", "BCB", " D ", 'A', wyvernCore, 'B', "ingotDraconium", 'C', DIAMOND_AXE, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernAxe, "ABA", "CDC", "AEA", 'A', "netherStar", 'B', wyvernCore, 'C', "blockDraconium", 'D', DIAMOND_AXE, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernBow, " A ", "BCB", " D ", 'A', wyvernCore, 'B', "ingotDraconium", 'C', BOW, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernBow, "ABA", "CDC", "AEA", 'A', "netherStar", 'B', wyvernCore, 'C', "blockDraconium", 'D', BOW, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernSword, " A ", "BCB", " D ", 'A', wyvernCore, 'B', "ingotDraconium", 'C', DIAMOND_SWORD, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernSword, "ABA", "CDC", "AEA", 'A', "netherStar", 'B', wyvernCore, 'C', "blockDraconium", 'D', DIAMOND_SWORD, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernHelm, "ABA", "ACA", "ADA", 'A', "ingotDraconium", 'B', wyvernCore, 'C', DIAMOND_HELMET, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernHelm, "ABA", "CDC", "AEA", 'A', "blockDraconium", 'B', wyvernCore, 'C', "netherStar", 'D', DIAMOND_HELMET, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernChest, "ABA", "ACA", "ADA", 'A', "ingotDraconium", 'B', wyvernCore, 'C', DIAMOND_CHESTPLATE, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernChest, "ABA", "CDC", "AEA", 'A', "blockDraconium", 'B', wyvernCore, 'C', "netherStar", 'D', DIAMOND_CHESTPLATE, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernLegs, "ABA", "ACA", "ADA", 'A', "ingotDraconium", 'B', wyvernCore, 'C', DIAMOND_LEGGINGS, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernLegs, "ABA", "CDC", "AEA", 'A', "blockDraconium", 'B', wyvernCore, 'C', "netherStar", 'D', DIAMOND_LEGGINGS, 'E', wyvernEnergyCore);
        addShaped(NORMAL, wyvernBoots, "ABA", "ACA", "ADA", 'A', "ingotDraconium", 'B', wyvernCore, 'C', DIAMOND_BOOTS, 'D', wyvernEnergyCore);
        addShaped(HARD, wyvernBoots, "ABA", "CDC", "AEA", 'A', "blockDraconium", 'B', wyvernCore, 'C', "netherStar", 'D', DIAMOND_BOOTS, 'E', wyvernEnergyCore);

        //Draconic
        addFusionTool(NORMAL, new ItemStack(draconicPick), new ItemStack(wyvernPick), 16000, 2, awakenedCore, "ingotDraconiumAwakened", draconicEnergyCore, "ingotDraconiumAwakened");
        addFusionTool(HARD, new ItemStack(draconicPick), new ItemStack(wyvernPick), 512000, 2, draconicEnergyCore, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened");
        addFusionTool(NORMAL, new ItemStack(draconicShovel), new ItemStack(wyvernShovel), 16000, 2, awakenedCore, "ingotDraconiumAwakened", draconicEnergyCore, "ingotDraconiumAwakened");
        addFusionTool(HARD, new ItemStack(draconicShovel), new ItemStack(wyvernShovel), 512000, 2, draconicEnergyCore, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened");
        addFusionTool(NORMAL, new ItemStack(draconicAxe), new ItemStack(wyvernAxe), 16000, 2, awakenedCore, "ingotDraconiumAwakened", draconicEnergyCore, "ingotDraconiumAwakened");
        addFusionTool(HARD, new ItemStack(draconicAxe), new ItemStack(wyvernAxe), 512000, 2, draconicEnergyCore, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened");
        addFusionTool(NORMAL, new ItemStack(draconicBow), new ItemStack(wyvernBow), 16000, 2, awakenedCore, "ingotDraconiumAwakened", draconicEnergyCore, "ingotDraconiumAwakened");
        addFusionTool(HARD, new ItemStack(draconicBow), new ItemStack(wyvernBow), 512000, 2, draconicEnergyCore, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened");
        addFusionTool(NORMAL, new ItemStack(draconicSword), new ItemStack(wyvernSword), 16000, 2, awakenedCore, "ingotDraconiumAwakened", draconicEnergyCore, "ingotDraconiumAwakened");
        addFusionTool(HARD, new ItemStack(draconicSword), new ItemStack(wyvernSword), 512000, 2, draconicEnergyCore, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened");
        addFusionTool(NORMAL, new ItemStack(draconicHoe), new ItemStack(DIAMOND_HOE), 16000, 2, awakenedCore, "ingotDraconiumAwakened", draconicEnergyCore, "ingotDraconiumAwakened");
        addFusionTool(HARD, new ItemStack(draconicHoe), new ItemStack(DIAMOND_HOE), 512000, 2, draconicEnergyCore, awakenedCore, "blockDraconiumAwakened", "blockDraconiumAwakened");
        addFusionTool(NORMAL, new ItemStack(draconicStaffOfPower), new ItemStack(draconicPick), 16000, 2, "ingotDraconiumAwakened", "ingotDraconiumAwakened", "ingotDraconiumAwakened", "ingotDraconiumAwakened", "ingotDraconiumAwakened", awakenedCore, draconicShovel, draconicSword);
        addFusionTool(HARD, new ItemStack(draconicStaffOfPower), new ItemStack(draconicPick), 512000, 2, "blockDraconiumAwakened", "blockDraconiumAwakened", "blockDraconiumAwakened", "blockDraconiumAwakened", "blockDraconiumAwakened", awakenedCore, draconicShovel, draconicSword);
        addFusionTool(NORMAL, new ItemStack(draconicHelm), new ItemStack(wyvernHelm), 320000, 2, "ingotDraconiumAwakened", awakenedCore, draconicEnergyCore, draconicEnergyCore);
        addFusionTool(HARD, new ItemStack(draconicHelm), new ItemStack(wyvernHelm), 5000000, 2, "blockDraconiumAwakened", awakenedCore, draconicEnergyCore);
        addFusionTool(NORMAL, new ItemStack(draconicChest), new ItemStack(wyvernChest), 320000, 2, "ingotDraconiumAwakened", awakenedCore, draconicEnergyCore, draconicEnergyCore);
        addFusionTool(HARD, new ItemStack(draconicChest), new ItemStack(wyvernChest), 5000000, 2, "blockDraconiumAwakened", awakenedCore, draconicEnergyCore);
        addFusionTool(NORMAL, new ItemStack(draconicLegs), new ItemStack(wyvernLegs), 320000, 2, "ingotDraconiumAwakened", awakenedCore, draconicEnergyCore, draconicEnergyCore);
        addFusionTool(HARD, new ItemStack(draconicLegs), new ItemStack(wyvernLegs), 5000000, 2, "blockDraconiumAwakened", awakenedCore, draconicEnergyCore);
        addFusionTool(NORMAL, new ItemStack(draconicBoots), new ItemStack(wyvernBoots), 320000, 2, "ingotDraconiumAwakened", awakenedCore, draconicEnergyCore, draconicEnergyCore);
        addFusionTool(HARD, new ItemStack(draconicBoots), new ItemStack(wyvernBoots), 5000000, 2, "blockDraconiumAwakened", awakenedCore, draconicEnergyCore);

        addShaped(NORMAL, draconiumCapacitor, "ABA", "BCB", "ABA", 'A', "ingotDraconium", 'B', wyvernEnergyCore, 'C', wyvernCore);
        addShaped(HARD, draconiumCapacitor, "ABA", "BCB", "ABA", 'A', "blockDraconium", 'B', wyvernEnergyCore, 'C', wyvernCore);
        addShaped(NORMAL, new ItemStack(draconiumCapacitor, 1, 1), "ABA", "CDC", "ACA", 'A', draconicEnergyCore, 'B', awakenedCore, 'C', "ingotDraconiumAwakened", 'D', draconiumCapacitor);
        addShaped(HARD, new ItemStack(draconiumCapacitor, 1, 1), "ABA", "CDC", "ACA", 'A', draconicEnergyCore, 'B', awakenedCore, 'C', "blockDraconiumAwakened", 'D', draconiumCapacitor);

        addShaped(NORMAL, dislocator, "ABA", "BCB", "ABA", 'A', BLAZE_POWDER, 'B', "dustDraconium", 'C', ENDER_EYE);
        addShaped(HARD, dislocator, "ABA", "BCB", "ABA", 'A', BLAZE_POWDER, 'B', "dustDraconium", 'C', CHORUS_FLOWER);

        addFusion(NORMAL, new ItemStack(dislocatorAdvanced), new ItemStack(dislocator), 1000000, 1, "enderpearl", "ingotDraconium", "enderpearl", "ingotDraconium", "enderpearl", "ingotDraconium", wyvernCore, "ingotDraconium");
        addFusion(HARD, new ItemStack(dislocatorAdvanced), new ItemStack(dislocator), 10000000, 2, "enderpearl", "ingotDraconium", "enderpearl", "ingotDraconium", "enderpearl", "ingotDraconium", DRAGON_EGG, "ingotDraconium");

        //endregion

        //region Armor

        //endregion

        //region Upgrade Keys
        addShaped(ALL, getKey(ToolUpgrade.RF_CAPACITY    ), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', wyvernEnergyCore);
        addShaped(ALL, getKey(ToolUpgrade.DIG_SPEED      ), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', GOLDEN_PICKAXE);
        addShaped(ALL, getKey(ToolUpgrade.DIG_AOE        ), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', "enderpearl");
        addShaped(ALL, getKey(ToolUpgrade.ATTACK_DAMAGE  ), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', GOLDEN_SWORD);
        addShaped(ALL, getKey(ToolUpgrade.ATTACK_AOE     ), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', DIAMOND_SWORD);
        addShaped(ALL, getKey(ToolUpgrade.ARROW_DAMAGE   ), "ABC", "DED", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotGold", 'D', "ingotDraconium", 'E', ARROW);
        addShaped(ALL, getKey(ToolUpgrade.DRAW_SPEED     ), "ABA", "CDC", "ABE", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', BOW, 'E', "ingotGold");
        addShaped(ALL, getKey(ToolUpgrade.ARROW_SPEED    ), "ABC", "DED", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "feather", 'D', "ingotDraconium", 'E', ARROW);
        addShaped(ALL, getKey(ToolUpgrade.SHIELD_CAPACITY), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', DIAMOND_CHESTPLATE);
        addShaped(ALL, getKey(ToolUpgrade.SHIELD_RECOVERY), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', GOLDEN_CHESTPLATE);
        addShaped(ALL, getKey(ToolUpgrade.MOVE_SPEED     ), "ABA", "CDC", "AEA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', GOLDEN_BOOTS, 'E', "blockRedstone");
        addShaped(ALL, getKey(ToolUpgrade.JUMP_BOOST     ), "ABA", "CDC", "AEA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', GOLDEN_BOOTS, 'E', "blockSlime");
        //endregion

        //region Misc

        addShaped(ALL, infoTablet, "AAA", "ABA", "AAA", 'A', "stone", 'B', draconiumDust);
        addShaped(NORMAL, magnet, "A A", "B B", "CDC", 'A', "dustRedstone", 'B', "ingotDraconium", 'C', "ingotIron", 'D', dislocator);
        addShaped(HARD, magnet, "A A", "B B", "BCB", 'A', "blockRedstone", 'B', "ingotDraconium", 'C', dislocator);
        addShaped(NORMAL, new ItemStack(magnet, 1, 1), "A A", "B B", "CDC", 'A', "ingotDraconium", 'B', "dustRedstone", 'C', "ingotDraconiumAwakened", 'D', magnet);
        addShaped(HARD, new ItemStack(magnet, 1, 1), "A A", "BCB", "DED", 'A', "ingotDraconium", 'B', "dustRedstone", 'C', magnet, 'D', "ingotDraconiumAwakened", 'E', dislocatorAdvanced);

        //endregion

        //region Exotic Items

        //endregion

        /* ------------------ Other ------------------ */
        if (RecipeManager.isEnabled(DEFeatures.draconiumDust) && RecipeManager.isEnabled(DEFeatures.draconiumIngot)){
            GameRegistry.addSmelting(DEFeatures.draconiumDust, new ItemStack(DEFeatures.draconiumIngot), 0);
        }
        RecipeManager.addRecipe(new RecipeDislocatorClone());
    }

    //region Helpers

    public static ItemStack getKey(String name) {
        return new ItemStack(DEFeatures.toolUpgrade, 1, ToolUpgrade.NAME_TO_ID.get(name));
    }

    public static void addUpgradeKey(ItemStack input, String name) {
        addShaped(ALL, new ItemStack(DEFeatures.toolUpgrade, 1, ToolUpgrade.NAME_TO_ID.get(name)), "ABA", "CDC", "ABA", 'A', new ItemStack(DYE, 1, 4), 'B', draconicCore, 'C', "ingotDraconium", 'D', input);
    }


    //endregion
}
