package net.liyze.create_metal;
//Liyze's First Minecraft Mod!
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
public class create_metal implements ModInitializer {
    public static final Item Tin_Ingot;

    static {
        Tin_Ingot = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    }
    public static final Item Raw_Tin;

    static {
        Raw_Tin = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    }
    public static final Item Tin_Nugget;

    static {
        Tin_Nugget = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    }
    public static Block Tin_Ore_Block;

    static {
        Tin_Ore_Block = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE));
    }
    public static BlockItem Tin_Ore_Item;

    static {
        Tin_Ore_Item = new BlockItem(Tin_Ore_Block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    public static Block Tin_Deep_Ore_Block;

    static {
        Tin_Deep_Ore_Block = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F));
    }
    public static BlockItem Tin_Deep_Ore_Item;

    static {
        Tin_Deep_Ore_Item = new BlockItem(Tin_Deep_Ore_Block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    public static Block Tin_Block;

    static {
        Tin_Block = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    }
    public static BlockItem Tin_Block_Item;

    static {
        Tin_Block_Item = new BlockItem(Tin_Block, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    @Override
    public void onInitialize(){
        //Tin Block
        Registry.register(Registry.BLOCK,new Identifier("create_metal","tin_block"),Tin_Block);
        Registry.register(Registry.ITEM,new Identifier("create_metal","tin_block"),Tin_Block_Item);
        //Tin Ore
        Registry.register(Registry.BLOCK,new Identifier("create_metal","tin_ore"),Tin_Ore_Block);
        Registry.register(Registry.ITEM,new Identifier("create_metal","tin_ore"),Tin_Ore_Item);
        //Tin Deepslate Ore
        Registry.register(Registry.BLOCK,new Identifier("create_metal","deepslate_tin_ore"),Tin_Deep_Ore_Block);
        Registry.register(Registry.ITEM,new Identifier("create_metal","deepslate_tin_ore"),Tin_Deep_Ore_Item);
        //Tin Items
        Registry.register(Registry.ITEM,new Identifier("create_metal","tin_ingot"),Tin_Ingot);
        Registry.register(Registry.ITEM,new Identifier("create_metal","raw_tin"),Raw_Tin);
        Registry.register(Registry.ITEM,new Identifier("create_metal","tin_nugget"),Tin_Nugget);
    }
}
