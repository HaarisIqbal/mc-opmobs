package me.volcifier.opmobs.listeners;

import org.bukkit.entity.Creeper;
import org.bukkit.entity.EntityType;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.CreatureSpawnEvent;

public class Listeners implements Listener {
  
  @EventHandler
  public void creatureSpawn(CreatureSpawnEvent event) {
    
    // What to do if a creeper has spawned.
    if (event.getEntityType() == EntityType.CREEPER) {
      Creeper creeper = (Creeper) event.getEntity();
      // when creepers spawn, they will be powered.
      creeper.setPowered(true);
    }
    
  }
  
}
