package com.jad.dogfight.model;

import com.jad.dogfight.ISprite;

import java.awt.*;

public class Sprite implements ISprite {
    private final Dimension dimension;
    private final Tile matrix[][];

    public Sprite(final Dimension dimension) {
        this.dimension = dimension;
        this.matrix = new Tile[this.dimension.height][this.dimension.width];
    }

    public Dimension getDimension() {
        return this.dimension;
    }

    public void setTileAt(final int x, final int y, final Tile tile) {
        if ((x >= 0) && (x < this.dimension.width)
                && (y >= 0) && (y < this.dimension.height)) {
            this.matrix[y][x] = tile;
        }
    }

    @Override
    public char getPixelAt(final int dx, final int dy) {
        return this.getTileAt(dx, dy).getPixel();
    }

    public Tile getTileAt(final int x, final int y) {
        if ((x < 0) || (x >= this.dimension.width)
                || (y < 0) || (y >= this.dimension.height)) {
            return Tile.EMPTY;
        }
        return this.matrix[y][x];
    }

    @Override
    public int getHeight() {
        return this.dimension.height;
    }

    @Override
    public int getWidth() {
        return this.dimension.width;
    }
}
