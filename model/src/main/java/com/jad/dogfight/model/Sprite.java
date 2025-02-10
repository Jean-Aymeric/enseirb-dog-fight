package com.jad.dogfight.model;

import java.awt.*;

public class Sprite {
    private final Dimension dimension;
    private final Tile matrix[][];

    public Sprite(final Dimension dimension) {
        this.dimension = dimension;
        this.matrix = new Tile[this.dimension.height][this.dimension.width];
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public Tile getTileAt(final int x, final int y) {
        if ((x < 0) || (x >= this.dimension.width)
                || (y < 0) || (y >= this.dimension.height)) {
            return Tile.EMPTY;
        }
        return this.matrix[y][x];
    }

    public void setTileAt(final int x, final int y, final Tile tile) {
        if ((x >= 0) && (x < this.dimension.width)
                && (y >= 0) && (y < this.dimension.height)) {
            this.matrix[y][x] = tile;
        }
    }
}
