package com.jad.dogfight;

import java.util.List;

public interface IModel {

    void movesAllMobiles();

    int getHeight();

    int getWidth();

    char getEmptyPixel();

    List<? extends IMobile> getAllMobiles();

    void turnLeft(final int player);

    void turnRight(final int player);
}
