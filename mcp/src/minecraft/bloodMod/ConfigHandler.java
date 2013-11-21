package bloodMod;

import java.io.File;

import net.minecraftforge.common.Configuration;

public class ConfigHandler {
public static void init(File configFile) {
Configuration config = new Configuration(configFile);

config.load();

config.save();
}
}