package bloodMod;

import net.minecraft.command.CommandBase;
import net.minecraft.command.ICommandSender;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.server.MinecraftServer;
import net.minecraft.src.ModLoader;

public class Commands extends CommandBase{

	@Override
	public String getCommandName()
	{
	return "infome";
	// Name of the command "test" will be called by "/test"
	}

	@Override
	public String getCommandUsage(ICommandSender icommandsender)
	{
	return "Outputs NBT info on currently held item";
	// Message to show when the user uses "/help test"
	}

	@Override
	public void processCommand(ICommandSender icommandsender, String[] astring)
	{
		if(icommandsender instanceof EntityPlayer){
			EntityPlayer player = (EntityPlayer) icommandsender;
			player.addChatMessage(player.inventory.getCurrentItem().getTagCompound().toString());
			player.addChatMessage(""+MinecraftServer.getServer().getTickCounter());
		}
	}

}