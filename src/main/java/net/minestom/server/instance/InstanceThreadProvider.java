package net.minestom.server.instance;

import net.minestom.server.thread.ThreadProvider;
import org.jetbrains.annotations.ApiStatus;
import org.jetbrains.annotations.NotNull;

@ApiStatus.Experimental
public class InstanceThreadProvider implements ThreadProvider<Chunk> {

    @Override
    public int findThread(@NotNull Chunk partition) {
        return partition.instance.sequentialId;
    }
}
