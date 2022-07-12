package me.tofaa.event;

import me.tofaa.Survivalist;
import me.tofaa.event.player.PlayerLoginListener;
import net.minestom.server.event.EventFilter;
import net.minestom.server.event.EventNode;
import net.minestom.server.event.trait.BlockEvent;
import net.minestom.server.event.trait.PlayerEvent;

import java.util.LinkedHashSet;

public class EventManager {

    public static final EventNode<PlayerEvent> PLAYER_NODE = EventNode.type("player", EventFilter.PLAYER);
    public static final EventNode<BlockEvent> BLOCK_NODE = EventNode.type("block", EventFilter.BLOCK);



    private final LinkedHashSet<Listener> listeners = new LinkedHashSet<>();

    public EventManager() {
        // Register the nodes here
        Survivalist.getGlobalEventHandler().addChild(PLAYER_NODE);
        Survivalist.getGlobalEventHandler().addChild(BLOCK_NODE);

        // Register the listeners here
        addListener(new PlayerLoginListener());
    }

    public void addListener(Listener listener) {
        Survivalist.getLogger().info("Adding listener " + listener.getClass().getSimpleName() + " to the listener node " + listener.getNode().getName());
        listeners.add(listener);
    }


}
