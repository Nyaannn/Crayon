package nyaann.crayon;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.AsyncPlayerChatEvent;
import org.bukkit.plugin.java.JavaPlugin;
public final class Crayon extends JavaPlugin implements Listener {
    @Override
    public void onEnable() {
        System.out.println("Hello!");
        this.getServer().getPluginManager().registerEvents(this, this);
    }
    @Override
    public void onDisable() {
        System.out.println("Goodbye!");
    }
    @EventHandler
    public void chat(AsyncPlayerChatEvent e)
    {
        Player player = e.getPlayer();
        if(e.getMessage().contains("${")){e.setCancelled(true);}
        if(e.getMessage().contains("jndi:")){e.setCancelled(true);}
        if(e.getMessage().contains("ldap")){e.setCancelled(true);}

        if(e.getMessage().startsWith(">")){e.setMessage(ChatColor.GREEN+e.getMessage().replace(">",""));}
        if(e.getMessage().startsWith("`")){e.setMessage(ChatColor.BLUE+e.getMessage().replace("`",""));}
        if(e.getMessage().startsWith("<")){e.setMessage(ChatColor.RED+e.getMessage().replace("<",""));}
        if(e.getMessage().startsWith("!")){e.setMessage(ChatColor.YELLOW+e.getMessage().replace("!",""));}
        if(e.getMessage().startsWith(":")){e.setMessage(ChatColor.AQUA+e.getMessage().replace(":",""));}
        if(e.getMessage().startsWith("@")){e.setMessage(ChatColor.LIGHT_PURPLE+e.getMessage().replace("@",""));}
    }
}
