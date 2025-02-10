package com.jad.dogfight.model;

import com.jad.dogfight.Position;

public class Plane extends AbstractMobile {
    public Plane(final Position position, final Direction direction) {
        super(position, direction, new PlaneSprite());
    }

    @Override
    public void turnLeft() {
        this.setDirection(this.getDirection().getLeft());
    }

    @Override
    public void turnRight() {
        this.setDirection(this.getDirection().getRight());
    }
}
