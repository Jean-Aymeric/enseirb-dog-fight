package com.jad.dogfight.model;

public enum Tile {
    EMPTY('.'),
    FULL('*');

    private final char pixel;

    Tile(final char pixel) {
        this.pixel = pixel;
    }

    public char getPixel() {
        return this.pixel;
    }
}
