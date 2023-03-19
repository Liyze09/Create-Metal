package net.liyze.create_metal;
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
public class create_metal implements ModInitializer {
    //Item Classes
    //Tin
    public static final Item TinIngot;
    static {
        TinIngot = new Item(new FabricItemSettings().group(ItemGroup.MISC));}
    public static final Item RawTin;
    static {
        RawTin = new Item(new FabricItemSettings().group(ItemGroup.MISC));}
    public static final Item TinNugget;
    static {
        TinNugget = new Item(new FabricItemSettings().group(ItemGroup.MISC));}
    //Bronze
    public static final Item BronzeIngot;
    static {
        BronzeIngot = new Item(new FabricItemSettings().group(ItemGroup.MISC));}
    //Steel
    public  static final Item SteelIngot;
    static {
        SteelIngot = new Item(new FabricItemSettings().group(ItemGroup.MISC));}
    //Block Classes
    //Steel
    public static final Block SteelBlock;
    static {
        SteelBlock = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(4.0F, 6.0F).sounds(BlockSoundGroup.METAL));}
    public static final BlockItem SteelBlockItem;
    static {
        SteelBlockItem = new BlockItem(SteelBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));}
    //Bronze
    public static final Block BronzeBlock;
    static {
        BronzeBlock = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));}
    public static final BlockItem BronzeBlockItem;
    static {
        BronzeBlockItem = new BlockItem(BronzeBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));}
    //Tin
    public static final Block TinOreBlock;
    static {
        TinOreBlock = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(4.5F, 3.0F).sounds(BlockSoundGroup.DEEPSLATE));}
    public static final BlockItem TinOreItem;
    static {
        TinOreItem = new BlockItem(TinOreBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));}
    public static final Block TinDeepOreBlock;
    static {
        TinDeepOreBlock = new Block(FabricBlockSettings.of(Material.STONE).requiresTool().strength(3.0F, 3.0F));}
    public static final BlockItem TinDeepOreItem;
    static {
        TinDeepOreItem = new BlockItem(TinDeepOreBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));}
    public static final Block TinBlock;
    static {
        TinBlock = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));}
    public static final BlockItem TinBlockItem;
    static {
        TinBlockItem = new BlockItem(TinBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));}
    public static final Block RawTinBlock;
    static {
        RawTinBlock = new Block(FabricBlockSettings.of(Material.METAL).requiresTool().strength(3.0F, 6.0F).sounds(BlockSoundGroup.METAL));}
    public static final BlockItem RawTinBlockItem;
    static {
        RawTinBlockItem = new BlockItem(RawTinBlock, new FabricItemSettings().group(ItemGroup.BUILDING_BLOCKS));}
    //Worldgen
    public static final ConfiguredFeature<?, ?> OverworldTinOreConfiguredFeature;
    static  {
        OverworldTinOreConfiguredFeature = new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, TinOreBlock.getDefaultState(), 6));}
    public static final PlacedFeature OverworldTinOrePlacedFeature;
    static {
        OverworldTinOrePlacedFeature = new PlacedFeature(RegistryEntry.of(OverworldTinOreConfiguredFeature), Arrays.asList(CountPlacementModifier.of(20), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.fixed(0), YOffset.fixed(128))));}
    public static final ConfiguredFeature<?, ?> OverworldDeepTinOreConfiguredFeature;
    static  {
        OverworldDeepTinOreConfiguredFeature = new ConfiguredFeature<>(Feature.ORE, new OreFeatureConfig(OreConfiguredFeatures.STONE_ORE_REPLACEABLES, TinDeepOreBlock.getDefaultState(), 6));}
    public static final PlacedFeature OverworldDeepTinOrePlacedFeature;
    static {
        OverworldDeepTinOrePlacedFeature = new PlacedFeature(RegistryEntry.of(OverworldDeepTinOreConfiguredFeature), Arrays.asList(CountPlacementModifier.of(20), SquarePlacementModifier.of(), HeightRangePlacementModifier.uniform(YOffset.getBottom(), YOffset.fixed(0))));}
    @Override
    public void onInitialize(){
        //Tin
        //Tin Block
        Registry.register(Registry.BLOCK,new Identifier(
                "create_metal","tin_block"), TinBlock);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","tin_block"), TinBlockItem);
        //Raw Tin Block
        Registry.register(Registry.BLOCK,new Identifier(
                "create_metal","raw_tin_block"), RawTinBlock);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","raw_tin_block"), RawTinBlockItem);
        //Tin Ore
        Registry.register(Registry.BLOCK,new Identifier(
                "create_metal","tin_ore"), TinOreBlock);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","tin_ore"), TinOreItem);
        //Tin Deepslate Ore
        Registry.register(Registry.BLOCK,new Identifier(
                "create_metal","deepslate_tin_ore"), TinDeepOreBlock);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","deepslate_tin_ore"), TinDeepOreItem);
        //Tin Items
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","tin_ingot"), TinIngot);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","raw_tin"), RawTin);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","tin_nugget"), TinNugget);
        //Bronze
        //Bronze Items
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","bronze_ingot"), BronzeIngot);
        //Bronze Block
        Registry.register(Registry.BLOCK,new Identifier(
                "create_metal","bronze_block"), BronzeBlock);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","bronze_block"), BronzeBlockItem);
        //Steel Item
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","steel_ingot"),SteelIngot);
        //Steel Block
        Registry.register(Registry.BLOCK,new Identifier(
                "create_metal","steel_block"), SteelBlock);
        Registry.register(Registry.ITEM,new Identifier(
                "create_metal","steel_block"), SteelBlockItem);
        //Worldgen
        //Tin Ores
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(
                "create_metal", "tin_ore"), OverworldTinOreConfiguredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(
                "create_metal", "tin_ore"), OverworldTinOrePlacedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(
                "create_metal", "tin_ore")));
        //Tin Deepslate Ores
        Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new Identifier(
                "create_metal", "deepslate_tin_ore"), OverworldDeepTinOreConfiguredFeature);
        Registry.register(BuiltinRegistries.PLACED_FEATURE, new Identifier(
                "create_metal", "deepslate_tin_ore"), OverworldDeepTinOrePlacedFeature);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, RegistryKey.of(Registry.PLACED_FEATURE_KEY, new Identifier(
                "create_metal", "deepslate_tin_ore")));}}