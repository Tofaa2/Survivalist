package me.tofaa.configuration.types;

import me.tofaa.Survivalist;
import me.tofaa.configuration.JSONConfiguration;
import me.tofaa.utils.FileUtils;
import net.minestom.server.MinecraftServer;

import java.io.File;

public class ServerPropertiesConfiguration {

    private final File launchDir = new File(FileUtils.decodeLauncherDir());
    private final File file = new File(launchDir + "/server-properties.survivalist");

    private final JSONConfiguration configuration = JSONConfiguration.loadExistingConfiguration(file);


    public ServerPropertiesConfiguration() {
        if (configuration.isEmpty()) {
            MinecraftServer.LOGGER.info("Configuration file is empty/corrupted, using the default values");
            configuration.set("debug-mode", false);
            configuration.set("server-port", 25565);
            configuration.set("server-ip", "0.0.0.0");
            configuration.set("server-name", "Survivalist");
            configuration.set("server-motd", "A Minecraft server for Minecraft 1.18.2");
            configuration.set("server-max-players", 20);
            configuration.set("server-allow-flight", false);
            configuration.set("server-allow-nether", true);

            configuration.save();
        }
    }

    public void save() {
        configuration.save();
    }


    public boolean isDebugMode() {return (boolean) configuration.get("debug-mode");}
    public int getServerPort() {return (int) configuration.get("server-port");}
    public String getServerIP() {return (String) configuration.get("server-ip");}
    public String getServerName() {return (String) configuration.get("server-name");}
    public String getServerMotd() {return (String) configuration.get("server-motd");}
    public int getServerMaxPlayers() {return (int) configuration.get("server-max-players");}
    public boolean isServerAllowFlight() {return (boolean) configuration.get("server-allow-flight");}
    public boolean isServerAllowNether() {return (boolean) configuration.get("server-allow-nether");}

}
