package com.jad.dogfight.model;

import com.jad.dogfight.Position;

public interface IMobile {
    void move();

    void turnLeft();

    void turnRight();

    Position getPosition();
}
