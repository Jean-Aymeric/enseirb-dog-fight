package com.jad.dogfight;

public interface IMobile {
    void move(int width, int height);

    void turnLeft();

    void turnRight();

    Position getPosition();

    ISprite getSprite();

    int getY();

    int getX();

    Direction getDirection();
}
