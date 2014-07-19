package com.brandon3055.draconicevolution.common.blocks;

import net.minecraft.block.Block;
import cpw.mods.fml.common.registry.GameRegistry;
import com.brandon3055.draconicevolution.DraconicEvolution;
import com.brandon3055.draconicevolution.common.core.handler.ConfigHandler;

public class ModBlocks {
	public static Block xRayBlock;
	public static Block weatherController;
	public static Block sunDial;
	public static Block draconiumOre;
	public static Block testBlock;
	public static Block grinder;
	public static Block potentiometer;
	public static Block rainSensor;
	public static Block particleGenerator;
	public static Block playerDetector;
	public static Block playerDetectorAdvanced;
	public static Block energyInfuser;
	public static Block customSpawner;

	public static void init()
	{
		if(ConfigHandler.disableXrayBlock < 2) xRayBlock = new XRayBlock();
		weatherController = new BlockWeatherController();
		if(ConfigHandler.disableSunDial < 2) sunDial = new BlockSunDial();
		draconiumOre = new DraconiumOre();
		grinder = new Grinder();
		potentiometer = new Potentiometer();
		rainSensor = new RainSensor();
		particleGenerator = new ParticleGenerator();
		playerDetector = new PlayerDetector();
		playerDetectorAdvanced = new PlayerDetectorAdvanced();
		energyInfuser = new EnergyInfuser();
		customSpawner = new CustomSpawner();
		
		if(DraconicEvolution.debug) testBlock = new TestBlock();
		//testBlock = new TestBlock();

	}

	public static void register(final DraconicEvolutionBlock block)
	{
		GameRegistry.registerBlock(block, block.getUnwrappedUnlocalizedName(block.getUnlocalizedName()));
	}
}