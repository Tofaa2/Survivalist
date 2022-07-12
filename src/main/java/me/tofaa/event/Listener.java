package me.tofaa.event;

import net.minestom.server.event.Event;
import net.minestom.server.event.EventNode;

public interface Listener {

     EventNode<? extends Event> getNode();

}
