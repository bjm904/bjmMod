package bjmMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import net.minecraftforge.common.MinecraftForge;
import bjmMod.blocks.Blocks;
import bjmMod.items.Items;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@Mod( modid = ModInfo.ID, name = ModInfo.NAME, version = ModInfo.VERSION )
@NetworkMod ( channels = {ModInfo.CHANNEL}, clientSideRequired = true, serverSideRequired = true )


public class bjmMod {
	@SidedProxy ( clientSide = ModInfo.PROXY_LOCATION + ".ClientProxy", serverSide = ModInfo.PROXY_LOCATION + ".CommonProxy" )
	public static CommonProxy proxy;
	
	public static CreativeTabs CreativeTabBjmMod = new Tab(CreativeTabs.getNextID(), ModInfo.NAME);
	public static CreativeTabs CreativeTabBjmModTree = new TabTree(CreativeTabs.getNextID(), ModInfo.NAME+" Trees");
	
	
	@EventHandler
	public static void preInit( FMLPreInitializationEvent event ) {
		ConfigHandler.init(event.getSuggestedConfigurationFile());
		proxy.initRenderers();
		proxy.initSounds();
		Blocks.init();
		Items.init();
		Recipes.init();
		Items.addNames();
		Blocks.addNames();
		EnumToolMaterial dMac = EnumHelper.addToolMaterial("Ruby", 3, 64, 100.0F, 3, 15);
		
    };


	@EventHandler
	public static void init( FMLInitializationEvent event ) {
		LanguageRegistry.instance().addStringLocalization("itemGroup." + ModInfo.NAME, "en_US", ModInfo.NAME);
		LanguageRegistry.instance().addStringLocalization("itemGroup." + ModInfo.NAME+" Trees", "en_US", ModInfo.NAME+" Trees");
		MinecraftForge.EVENT_BUS.register(new Aerobreeze_Bonemeal_Event());
		MinecraftForge.EVENT_BUS.register(new Aqua_Bonemeal_Event());
		MinecraftForge.EVENT_BUS.register(new Daystar_Bonemeal_Event());
		MinecraftForge.EVENT_BUS.register(new Nightend_Bonemeal_Event());
	}

	@EventHandler
	public static void postInit( FMLPostInitializationEvent event ) {

	}
}
