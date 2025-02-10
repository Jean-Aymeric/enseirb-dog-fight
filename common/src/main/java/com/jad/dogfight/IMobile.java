package com.jad.dogfight;

public interface IMobile {
    void move();

    void turnLeft();

    void turnRight();

    Position getPosition();

    ISprite getSprite();

    int getY();

    int getX();
}
