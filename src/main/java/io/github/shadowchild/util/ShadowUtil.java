package io.github.shadowchild.util;


import io.github.shadowchild.util.utils.Refs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

import java.io.File;

@Mod(modid = Refs.MOD_ID, name = Refs.MOD_NAME, version = Refs.VERSION)
public class ShadowUtil {

    @Mod.Instance(Refs.MOD_ID)
    public static ShadowUtil INSTANCE;

    public File configFolder;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent e) {

        configFolder = e.getModConfigurationDirectory();
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent e) {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent e) {

    }
}
