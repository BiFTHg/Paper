package net.craftoriya.event;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.inventory.ItemStack;
import org.bukkit.loot.LootTable;
import org.jetbrains.annotations.NotNull;

public class BrushableBlockLootGenerateEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final LootTable lootTable;
    private ItemStack generatedItem;
    private boolean isCancelled;

    public BrushableBlockLootGenerateEvent(LootTable lootTable, ItemStack generatedItem) {
        this.lootTable = lootTable;
        this.generatedItem = generatedItem;
        this.isCancelled = false;
    }
    public ItemStack getGeneratedItem() {
        return this.generatedItem;
    }
    public void setGeneratedItem(ItemStack generatedItem) {
        this.generatedItem = generatedItem;
    }
    public LootTable getLootTable() {
        return this.lootTable;
    }
    @Override
    public @NotNull HandlerList getHandlers() {
        return handlers;
    }
    public static HandlerList getHandlerList() {
        return handlers;
    }

    @Override
    public boolean isCancelled() {
        return isCancelled;
    }

    @Override
    public void setCancelled(final boolean cancel) {
        this.isCancelled = cancel;
    }
}
