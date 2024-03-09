package net.craftoriya.event;

import org.bukkit.block.data.BlockData;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.jetbrains.annotations.NotNull;

public class FireSpreadEvent extends Event implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final BlockData blockData;
    private boolean isCancelled;

    public FireSpreadEvent(BlockData blockData) {
        this.blockData = blockData;
        this.isCancelled = false;
    }

    public BlockData getBlockData() {
        return blockData;
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
