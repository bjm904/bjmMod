package bjm904;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.EnumHelper;
import bjm904.blocks.Blocks;
import bjm904.items.Items;
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
	
	public static CreativeTabs CreativeTabBjmMod = new CreativeTabBjmMod(CreativeTabs.getNextID(), ModInfo.NAME);
	
	@EventHandler
	public static void preInit( FMLPreInitializationEvent event ) {
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
	}

	@EventHandler
	public static void postInit( FMLPostInitializationEvent event ) {

	}
}
