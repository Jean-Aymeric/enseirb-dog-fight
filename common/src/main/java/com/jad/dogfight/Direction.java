package com.jad.dogfight;

public enum Direction {
    EAST,
    SOUTH,
    WEST,
    NORTH;

    public Direction getLeft() {
        return Direction.values()[(this.ordinal() + Direction.values().length - 1) % Direction.values().length];
    }

    public Direction getRight() {
        return Direction.values()[(this.ordinal() + 1) % Direction.values().length];
    }
}
