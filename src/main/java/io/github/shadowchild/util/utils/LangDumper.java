package io.github.shadowchild.util.utils;


import com.nikhaldimann.inieditor.IniEditor;
import io.github.shadowchild.util.ShadowUtil;
import net.minecraft.block.Block;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.common.registry.EntityEntry;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

import java.io.File;
import java.io.IOException;

public class LangDumper {

    private static final String[] DOMAINS = new String[] { "fullmetal" };

    public static void dumpModLangs() throws IOException {

        for(String domain : DOMAINS) {

            dumpModLangs(domain);
        }
    }

    public static void dumpModLangs(String domain) throws IOException {

        IniEditor langs = new IniEditor();

        Block block;
        Enchantment enchant;
        EntityEntry entity;
        Item item;

        String registry_name;

        File lang_dump = new File(ShadowUtil.INSTANCE.configFolder, "ShadowUtil/lang_dump.props");
        if(!lang_dump.exists()) {

            lang_dump.getParentFile().mkdirs();
            lang_dump.createNewFile();
        }
        System.out.println(lang_dump.getAbsoluteFile().toString());
        langs.load(lang_dump);
        langs.addSection(domain);
        langs.addComment(domain, "Blocks");
        for(ResourceLocation resource : ForgeRegistries.BLOCKS.getKeys()) {

            if(resource.getResourceDomain().equals(domain)) {

                block = ForgeRegistries.BLOCKS.getValue(resource);
                registry_name = block.getUnlocalizedName();
                langs.set(domain, registry_name, registry_name);
            }
        }
        langs.addBlankLine(domain);
        langs.addComment(domain, "Enchantments");
        for(ResourceLocation resource : ForgeRegistries.ENCHANTMENTS.getKeys()) {

            if(resource.getResourceDomain().equals(domain)) {

                enchant = ForgeRegistries.ENCHANTMENTS.getValue(resource);
                registry_name = enchant.getName();
                langs.set(domain, registry_name, registry_name);
            }
        }
        langs.addBlankLine(domain);
        langs.addComment(domain, "Entities");
        for(ResourceLocation resource : ForgeRegistries.ENTITIES.getKeys()) {

            if(resource.getResourceDomain().equals(domain)) {

                entity = ForgeRegistries.ENTITIES.getValue(resource);
                registry_name = entity.getName();
                langs.set(domain, registry_name, registry_name);
            }
        }
        langs.addBlankLine(domain);
        langs.addComment(domain, "Entities");
        for(ResourceLocation resource : ForgeRegistries.ITEMS.getKeys()) {

            if(resource.getResourceDomain().equals(domain)) {

                item = ForgeRegistries.ITEMS.getValue(resource);
                registry_name = item.getUnlocalizedName();
                langs.set(domain, registry_name, registry_name);
            }
        }

        langs.save(lang_dump);
    }
}
