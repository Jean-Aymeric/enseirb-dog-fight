package com.jad.dogfight;

import com.jad.dogfight.model.Plane;
import com.jad.dogfight.model.Sky;
import com.jad.dogfight.model.Tile;

import java.util.List;

public class Model implements IModel {
    private static final int WIDTH = 450;
    private static final int HEIGHT = 120;
    private final Plane plane1;
    private final Plane plane2;
    private Sky sky;

    public Model() {
        this.sky = new Sky(Model.WIDTH, Model.HEIGHT);
        this.plane1 = new Plane(new Position(0, 0), Direction.EAST);
        this.plane2 = new Plane(new Position(400, 100), Direction.WEST);
        this.sky.addMobile(this.plane1);
        this.sky.addMobile(this.plane2);
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

    @Override
    public void turnLeft(final int player) {
        switch (player) {
            case 1 -> this.plane1.turnLeft();
            case 2 -> this.plane2.turnLeft();
        }
    }

    @Override
    public void turnRight(final int player) {
        switch (player) {
            case 1 -> this.plane1.turnRight();
            case 2 -> this.plane2.turnRight();
        }
    }
}
