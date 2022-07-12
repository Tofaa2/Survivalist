package me.tofaa.event.player;

import me.tofaa.Survivalist;
import me.tofaa.event.EventManager;
import me.tofaa.event.Listener;
import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import net.kyori.adventure.title.TitlePart;
import net.minestom.server.coordinate.Pos;
import net.minestom.server.entity.Player;
import net.minestom.server.event.Event;
import net.minestom.server.event.EventNode;
import net.minestom.server.event.player.PlayerLoginEvent;
import net.minestom.server.event.trait.PlayerEvent;
import net.minestom.server.instance.Instance;

public class PlayerLoginListener implements Listener {


    private final EventNode<PlayerEvent> node = EventManager.PLAYER_NODE;

    private final Instance spawnInstance = Survivalist.getInstanceManager().createInstanceContainer();

    public PlayerLoginListener() {
        node.addListener(PlayerLoginEvent.class, event -> {
            event.setSpawningInstance(spawnInstance);
            Player player = event.getPlayer();

            player.setRespawnPoint(new Pos(0, 100, 0));
        });
    }





    @Override
    public EventNode<? extends Event> getNode() {
        return node;
    }
}
