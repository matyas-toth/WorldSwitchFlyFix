package hu.reigdev.oneblockflyfix;

import hu.reigdev.oneblockflyfix.listeners.WorldChangeListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class OneBlockFlyFix extends JavaPlugin {

    @Override
    public void onEnable() {

        this.getServer().getPluginManager().registerEvents(new WorldChangeListener(), this);

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
