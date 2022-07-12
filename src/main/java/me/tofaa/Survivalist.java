package me.tofaa;

import lombok.Getter;
import me.tofaa.configuration.types.ServerPropertiesConfiguration;
import me.tofaa.event.EventManager;
import me.tofaa.event.player.PlayerLoginListener;
import me.tofaa.generator.NoiseGenerator;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.title.TitlePart;
import net.minestom.server.MinecraftServer;
import net.minestom.server.ServerProcess;
import net.minestom.server.command.CommandManager;
import net.minestom.server.entity.Player;
import net.minestom.server.event.GlobalEventHandler;
import net.minestom.server.event.player.PlayerLoginEvent;
import net.minestom.server.event.player.PlayerSpawnEvent;
import net.minestom.server.event.server.ServerListPingEvent;
import net.minestom.server.extras.optifine.OptifineSupport;
import net.minestom.server.instance.InstanceContainer;
import net.minestom.server.instance.InstanceManager;
import net.minestom.server.monitoring.BenchmarkManager;
import org.slf4j.Logger;

public class Survivalist {

    @Getter private static final String brandName = "Survivalist 1.18.2";
    private final MinecraftServer minecraftServer = MinecraftServer.init();
    private static final ServerProcess serverProcess = MinecraftServer.updateProcess();
    @Getter private static final InstanceManager instanceManager = MinecraftServer.getInstanceManager();
    @Getter private static final GlobalEventHandler globalEventHandler = MinecraftServer.getGlobalEventHandler();
    @Getter private static final Logger logger = MinecraftServer.LOGGER;
    @Getter private static final BenchmarkManager benchmarkManager = MinecraftServer.getBenchmarkManager();
    @Getter private static final CommandManager commandManager = MinecraftServer.getCommandManager();
    @Getter private static final EventManager eventManager = new EventManager();




    private final ServerPropertiesConfiguration serverProperties = new ServerPropertiesConfiguration();



    public void run() {




        InstanceContainer worldInstance = instanceManager.createInstanceContainer();
        System.out.println(globalEventHandler.toString());





        worldInstance.setGenerator(new NoiseGenerator());
        initServer();
    }



    private void initServer() {
        OptifineSupport.enable();
//        MojangAuth.init();
        MinecraftServer.setTerminalEnabled(true);
        MinecraftServer.setBrandName(brandName);
        logger.info("Initializing server...");



        minecraftServer.start(serverProperties.getServerIP(), serverProperties.getServerPort());
        logger.info("Started server on websocket " + serverProperties.getServerIP() + ":" + serverProperties.getServerPort());
    }

    private void shutdown() {
        logger.info("Attempting to save the server properties file.");
        serverProperties.save();
        logger.info("Server properties file saved.");
        MinecraftServer.stopCleanly();
    }



    public static void main(String[] args){
        Survivalist survivalist = new Survivalist();
        survivalist.run();
    }






}
