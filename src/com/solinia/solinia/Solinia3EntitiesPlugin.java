package com.solinia.solinia;

import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.messaging.PluginMessageListener;

import com.solinia.solinia.Entities.CustomEntityType;

public class Solinia3EntitiesPlugin extends JavaPlugin implements PluginMessageListener {
	@Override
	public void onEnable() {
		registerEntities();
		
		if (!getServer().getPluginManager().isPluginEnabled(this)) return;
		System.out.println("[Solinia3Core] Plugin Enabled");
	}

	@Override
	public void onDisable() {
		unregisterEntities(); // CustomEntityType.unregisterEntities();
		
		System.out.println("[Solinia3Core] Plugin Disabled");
	}

	@Override
	public void onPluginMessageReceived(String channel, Player player, byte[] message) {
		// TODO Auto-generated method stub
		
	}
	
	private void registerEntities() {
        try {
        	CustomEntityType.registerEntities();
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }

    private void unregisterEntities() {
        try {
            CustomEntityType.unregisterEntities();
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
    }
}
