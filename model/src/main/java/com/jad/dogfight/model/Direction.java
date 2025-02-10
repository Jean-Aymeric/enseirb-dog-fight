package com.jad.dogfight.model;

public enum Direction {
    NORTH,
    EAST,
    SOUTH,
    WEST;

    public Direction getLeft() {
        return Direction.values()[(this.ordinal() + Direction.values().length - 1) % Direction.values().length];
    }

    public Direction getRight() {
        return Direction.values()[(this.ordinal() + 1) % Direction.values().length];
    }
}
