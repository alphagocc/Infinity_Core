package com.github.alphagocc.Infinity_Ores;

import com.github.alphagocc.Infinity_Ores.common.CommonProxy;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * @author alphagocc
 */
@SidedProxy(clientSide = "com.github.ustc_zzzz.fmltutor.client.ClientProxy",
        serverSide = "com.github.ustc_zzzz.fmltutor.common.CommonProxy")
public static CommonProxy proxy;

@Mod(modid = FMLTutor.MODID, name = FMLTutor.NAME, version = FMLTutor.VERSION, acceptedMinecraftVersions = "1.10.2")
public class Infinity_Ores {
    public static final String MODID = "infinityOres";
    public static final String NAME = "Infinity Ores";
    public static final String VERSION = "0.0.1-alpha";

    @Instance(FMLTutor.MODID)
    public static FMLTutor instance;

    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event) {
        proxy.init(event);
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        proxy.postInit(event);
    }