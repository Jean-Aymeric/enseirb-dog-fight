package com.jad.dogfight.view;

import com.jad.dogfight.ISprite;

public class Screen {
    private final char[][] pixels;
    private final int height;
    private final int width;

    public Screen(final int width, final int height, final char defaultPixel) {
        this.pixels = new char[height][width];
        this.height = height;
        this.width = width;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                this.pixels[y][x] = defaultPixel;
            }
        }
    }

    public void setSpriteAtXY(final int x, final int y, final ISprite sprite) {
        for (int dy = 0; dy < sprite.getHeight(); dy++) {
            for (int dx = 0; dx < sprite.getWidth(); dx++) {
                this.setPixelAtXY(x + dx, y + dy, sprite.getPixelAt(dx, dy));
            }
        }
    }

    public void setPixelAtXY(final int x, final int y, final char pixel) {
        this.pixels[(y + this.height) % this.height][(x + this.width) % this.width] = pixel;
    }

    public String getText() {
        final StringBuilder result = new StringBuilder();
        for (int y = 0; y < this.height; y++) {
            for (int x = 0; x < this.width; x++) {
                result.append(this.getPixelAtXY(x, y));
            }
            result.append('\n');
        }
        return result.toString();
    }

    public char getPixelAtXY(final int x, final int y) {
        return this.pixels[y][x];
    }
}
