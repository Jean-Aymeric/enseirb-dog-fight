package com.jad.dogfight;

public interface IModel {

    void movesAllMobiles();

    int getHeight();

    int getWidth();

    boolean getSpriteAtXY(int x, int y);
}
