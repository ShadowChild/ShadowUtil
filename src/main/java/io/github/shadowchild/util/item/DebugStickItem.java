package io.github.shadowchild.util.item;


import io.github.shadowchild.util.utils.LangDumper;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;

import java.io.IOException;

public class DebugStickItem extends Item {

    public DebugStickItem() {

        this.setUnlocalizedName("debug_stick");
        this.setRegistryName("debug_stick");
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

        try {

            LangDumper.dumpModLangs();
        } catch(IOException e) {

            e.printStackTrace();
        }

        return super.onItemRightClick(worldIn, playerIn, handIn);
    }
}
