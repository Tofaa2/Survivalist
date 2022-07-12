package me.tofaa.generator;

import net.minestom.server.coordinate.Point;
import net.minestom.server.instance.block.Block;
import net.minestom.server.instance.generator.GenerationUnit;

public class TreePopulator {

    public static void populate(Point origin, GenerationUnit unit) {
        unit.fork(setter -> {
            setter.setBlock(origin.add(0, -1, 0), Block.DIRT);
            setter.setBlock(origin.add(0, -1, 0), Block.DIRT);
            setter.setBlock(origin.add(0, 0, 0), Block.OAK_LOG);
            setter.setBlock(origin.add(0, 1, 0), Block.OAK_LOG);
            setter.setBlock(origin.add(0, 2, 0), Block.OAK_LOG);
            setter.setBlock(origin.add(0, 3, 0), Block.OAK_LOG);
            setter.setBlock(origin.add(1, 1, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 1, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 1, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 1, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 1, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 1, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 1, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 1, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 1, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 1, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 1, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 1, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 1, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 1, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 1, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 1, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 1, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 1, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 1, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 1, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 1, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 1, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 1, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 1, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 2, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 2, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 2, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 2, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 2, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 2, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 2, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 2, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 2, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 2, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 2, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 2, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 2, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 2, 2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 2, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 2, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 2, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 2, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 2, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 2, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(2, 2, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 2, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 2, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-2, 2, -2), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 3, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 3, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 3, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 3, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 3, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 3, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 3, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 3, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(1, 4, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 4, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 4, 0), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 4, 1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(0, 4, -1), Block.OAK_LEAVES);
            setter.setBlock(origin.add(-1, 4, -1), Block.OAK_LEAVES);
        });
    }
}
