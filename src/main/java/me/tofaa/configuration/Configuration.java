package me.tofaa.configuration;

import java.util.HashMap;
import java.util.Map;

public class Configuration {

    private static final Map<String, Object> serverPropertiesDefault = new HashMap<>(){{
        put("server-port", 25565);
        put("server-ip", "0.0.0.0");
        put("server-name", "Survivalist");
        put("server-motd", "A Minecraft server for Minecraft 1.18.2");
        put("server-max-players", 20);
        put("server-allow-flight", false);
        put("server-allow-nether", true);
    }};



    public enum ServerProperty {
        SERVER_PORT("server-port"),
        SERVER_IP("server-ip"),
        SERVER_NAME("server-name"),
        SERVER_MOTD("server-motd"),
        SERVER_MAX_PLAYERS("server-max-players"),
        SERVER_ALLOW_FLIGHT("server-allow-flight"),
        SERVER_ALLOW_NETHER("server-allow-nether");

        private final String key;

        ServerProperty(String key) {
            this.key = key;
        }

        public String getKey() {
            return key;
        }
    }


}
