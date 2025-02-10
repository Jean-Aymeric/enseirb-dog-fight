package com.jad.dogfight.model;

public class Plane extends AbstractMobile {
    @Override
    public void turnLeft() {
        this.setDirection(this.getDirection().getLeft());
    }

    @Override
    public void turnRight() {
        this.setDirection(this.getDirection().getRight());
    }
}
