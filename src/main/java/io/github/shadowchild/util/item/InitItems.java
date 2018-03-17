package io.github.shadowchild.util.item;


import io.github.shadowchild.util.utils.Refs;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@Mod.EventBusSubscriber
public class InitItems {

    public static final DebugStickItem debugStick = new DebugStickItem();

    @SubscribeEvent
    public static void onItemRegister(RegistryEvent.Register<Item> e) {

        e.getRegistry().register(debugStick);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public static void onModelRegistry(ModelRegistryEvent e) {

        ModelLoader.setCustomModelResourceLocation(debugStick, 0, new ModelResourceLocation(
                Refs.MOD_ID + ":" + "debug_stick","inventory"));
    }
}
