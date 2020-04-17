package ml.peya.plugins.Events.Inventorys.Pickup;

import ml.peya.plugins.Inventorys.Inventory;
import ml.peya.plugins.Inventorys.*;
import org.bukkit.entity.*;
import org.bukkit.inventory.*;

public class OpenNowSelectInventory
{
    public static void process(Player player, ItemStack stack)
    {
        if (stack.equals(InventoryItem.getItem(InventoryItemType.IN_ITEM)))
            Inventory.openInInventory(player);
        else if (stack.equals(InventoryItem.getItem(InventoryItemType.OUT_ITEM)))
            Inventory.openOutInventory(player);
    }
}
