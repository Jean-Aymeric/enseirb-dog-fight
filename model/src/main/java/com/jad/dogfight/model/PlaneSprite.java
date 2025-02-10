package com.jad.dogfight.model;

import java.awt.*;

public class PlaneSprite extends Sprite {
    public PlaneSprite() {
        super(new Dimension(5, 5));
        boolean[][] plane = {
                {false, false, true, false, false},
                {true, false, false, true, false},
                {true, true, true, true, true},
                {false, false, false, true, false},
                {false, false, true, false, false}
        };
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                this.setTileAt(i, j, plane[j][i] ? Tile.FULL : Tile.EMPTY);
            }
        }
    }
}
