package com.jad.dogfight;

import com.jad.dogfight.model.Plane;
import com.jad.dogfight.model.Sky;
import com.jad.dogfight.model.Tile;

import java.util.List;

public class Model implements IModel {
    private static final int WIDTH = 450;
    private static final int HEIGHT = 120;

    private Sky sky;

    public Model() {
        this.sky = new Sky(Model.WIDTH, Model.HEIGHT);
        this.sky.addMobile(new Plane(new Position(0, 0), Direction.WEST));
    }

    @Override
    public void movesAllMobiles() {
        for (IMobile mobile : this.getAllMobiles()) {
            mobile.move(Model.WIDTH, Model.HEIGHT);
        }
    }

    @Override
    public int getHeight() {
        return Model.HEIGHT;
    }

    @Override
    public int getWidth() {
        return Model.WIDTH;
    }

    @Override
    public char getEmptyPixel() {
        return Tile.EMPTY.getPixel();
    }

    @Override
    public List<? extends IMobile> getAllMobiles() {
        return this.sky.getMobiles();
    }
}
