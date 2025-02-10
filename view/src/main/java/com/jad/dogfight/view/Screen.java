package com.jad.dogfight.view;

import com.jad.dogfight.ISprite;

public class Screen {
    private final char[][] pixels;

    public Screen(final int width, final int height, final char defaultPixel) {
        this.pixels = new char[height][width];
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                this.pixels[y][x] = defaultPixel;
            }
        }
    }

    public char getPixelAtXY(final int x, final int y) {
        return this.pixels[y][x];
    }

    public void setSpriteAtXY(final int x, final int y, final ISprite sprite) {
        for (int dy = 0; dy < sprite.getHeight(); dy++) {
            for (int dx = 0; dx < sprite.getWidth(); dx++) {
                this.setPixelAtXY(x + dx, y + dy, sprite.getPixelAt(dx, dy));
            }
        }
    }

    public void setPixelAtXY(final int x, final int y, final char pixel) {
        this.pixels[y][x] = pixel;
    }
}
