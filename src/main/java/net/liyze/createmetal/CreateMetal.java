/*First Mod
*by Liyze
* CREATE-METAL
*/
package net.liyze.createmetal;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.BuiltinRegistries;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryEntry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.YOffset;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.placementmodifier.CountPlacementModifier;
import net.minecraft.world.gen.placementmodifier.HeightRangePlacementModifier;
import net.minecraft.world.gen.placementmodifier.SquarePlacementModifier;

import java.util.Arrays;

public class CreateMetal implements ModInitializer {
    //Items
    //Tin
    public static final Item TIN_INGOT;
    static {
        TIN_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    }
    public static final Item RAW_TIN;
    static {
        RAW_TIN = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    }
    public static final Item TIN_NUGGET;
    static {
        TIN_NUGGET = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    }
    //Bronze
    public static final Item BRONZE_INGOT;
    static {
        BRONZE_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC));
    }
    //Steel
    public  static final Item STEEL_INGOT;
    static {
        STEEL_INGOT = new Item(new FabricItemSettings().group(ItemGroup.MISC).fireproof());
    }
    //Blocks
    //Steel
    public static final Block STEEL_BLOCK;
    static {
        STEEL_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(6.0F, 10.0F).sounds(BlockSoundGroup.METAL));
    }
    public static final BlockItem STEEL_BLOCK_ITEM;
    static {
        STEEL_BLOCK_ITEM = new BlockItem(STEEL_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS).fireproof());
    }
    //Bronze
    public static final Block BRONZE_BLOCK;
    static {
        BRONZE_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    }
    public static final BlockItem BRONZE_BLOCK_ITEM;
    static {
        BRONZE_BLOCK_ITEM = new BlockItem(BRONZE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    //Tin
    public static final Block TIN_ORE_BLOCK;
    static {
        TIN_ORE_BLOCK = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F).sounds(BlockSoundGroup.STONE));
    }
    public static final BlockItem TIN_ORE_ITEM;
    static {
        TIN_ORE_ITEM = new BlockItem(TIN_ORE_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    public static final Block TIN_DEEP_ORE;
    static {
        TIN_DEEP_ORE = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE));
    }
    public static final BlockItem TIN_DEEP_ORE_ITEM;
    static {
        TIN_DEEP_ORE_ITEM = new BlockItem(TIN_DEEP_ORE, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    public static final Block TIN_BLOCK;
    static {
        TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    }
    public static final BlockItem TIN_BLOCK_ITEM;
    static {
        TIN_BLOCK_ITEM = new BlockItem(TIN_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    public static final Block RAW_TIN_BLOCK;
    static {
        RAW_TIN_BLOCK = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));
    }
    public static final BlockItem RAW_TIN_BLOCK_ITEM;
    static {
        RAW_TIN_BLOCK_ITEM = new BlockItem(RAW_TIN_BLOCK, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));
    }
    //Worldgen
    //Tin Ore
    public static final ConfiguredFeature<?, ?> OVERWORLD_TIN_ORE_CONFIGURED_FEATURE;
    static  {
        OVERWORLD_TIN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, TIN_ORE_BLOCK.getDefaultState(), 6));
    }
    public static final PlacedFeature OVERWORLD_TIN_ORE_PLACED_FEATURE;
    static {
        OVERWORLD_TIN_ORE_PLACED_FEATURE = new PlacedFeature(RegistryEntry.of(OVERWORLD_TIN_ORE_CONFIGURED_FEATURE),
                Arrays.asList(CountPlacementModifier.of(20), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));
    }
    //Deepslate Tin Ore
    public static final ConfiguredFeature<?, ?> OVERWORLD_DEEP_TIN_ORE_CONFIGURED_FEATURE;
    static  {
        OVERWORLD_DEEP_TIN_ORE_CONFIGURED_FEATURE = new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.DEEPSLATE_ORE_REPLACEABLES, TIN_DEEP_ORE.getDefaultState(), 6));
    }
    public static final PlacedFeature OVERWORLD_DEEP_TIN_ORE_PLACED_FEATURE;
    static {
        OVERWORLD_DEEP_TIN_ORE_PLACED_FEATURE = new PlacedFeature(RegistryEntry.of(OVERWORLD_DEEP_TIN_ORE_CONFIGURED_FEATURE),
                Arrays.asList(CountPlacementModifier.of(20), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))));
    }
    @Override
    public void onInitialize(){
        //Tin
        //Tin Block
        Registry.register(Registry.BLOCK,new Identifier(
                "createmetal","tin_block"), TIN_BLOCK);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","tin_block"), TIN_BLOCK_ITEM);
        //Raw Tin Block
        Registry.register(Registry.BLOCK,new Identifier(
                "createmetal","raw_tin_block"), RAW_TIN_BLOCK);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","raw_tin_block"), RAW_TIN_BLOCK_ITEM);
        //Tin Ore
        Registry.register(Registry.BLOCK,new Identifier(
                "createmetal","tin_ore"), TIN_ORE_BLOCK);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","tin_ore"), TIN_ORE_ITEM);
        //Tin Deepslate Ore
        Registry.register(Registry.BLOCK,new Identifier(
                "createmetal","deepslate_tin_ore"), TIN_DEEP_ORE);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","deepslate_tin_ore"), TIN_DEEP_ORE_ITEM);
        //Tin Items
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","tin_ingot"), TIN_INGOT);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","raw_tin"), RAW_TIN);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","tin_nugget"), TIN_NUGGET);
        //Bronze
        //Bronze Items
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","bronze_ingot"), BRONZE_INGOT);
        //Bronze Block
        Registry.register(Registry.BLOCK,new Identifier(
                "createmetal","bronze_block"), BRONZE_BLOCK);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","bronze_block"), BRONZE_BLOCK_ITEM);
        //Steel Item
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","steel_ingot"), STEEL_INGOT);
        //Steel Block
        Registry.register(Registry.BLOCK,new Identifier(
                "createmetal","steel_block"), STEEL_BLOCK);
        Registry.register(Registry.ITEM,new Identifier(
                "createmetal","steel_block"), STEEL_BLOCK_ITEM);
        //Worldgen
        //Tin Ores
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(
                "createmetal", "tin_ore"), OVERWORLD_TIN_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(
                "createmetal", "tin_ore"), OVERWORLD_TIN_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(
                "createmetal", "tin_ore")));
        //Tin Deepslate Ores
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(
                "createmetal", "deepslate_tin_ore"), OVERWORLD_DEEP_TIN_ORE_CONFIGURED_FEATURE);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(
                "createmetal", "deepslate_tin_ore"), OVERWORLD_DEEP_TIN_ORE_PLACED_FEATURE);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES,
                RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(
                "createmetal", "deepslate_tin_ore")));
    }
}