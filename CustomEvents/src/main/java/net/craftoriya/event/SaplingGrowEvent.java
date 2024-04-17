package net.craftoriya.event;

import org.bukkit.block.Block;
import org.bukkit.block.data.BlockData;
import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;
import org.bukkit.event.block.BlockEvent;
import org.jetbrains.annotations.NotNull;

public class SaplingGrowEvent extends BlockEvent implements Cancellable {
    private static final HandlerList handlers = new HandlerList();

    private final BlockData blockData;
    private boolean isCancelled;

    public SaplingGrowEvent(BlockData blockData, Block theBlock) {
        super(theBlock);
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
