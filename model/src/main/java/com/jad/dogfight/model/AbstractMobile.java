package com.jad.dogfight.model;

import com.jad.dogfight.Direction;
import com.jad.dogfight.IMobile;
import com.jad.dogfight.ISprite;
import com.jad.dogfight.Position;

public abstract class AbstractMobile implements IMobile {
    private Position position;
    private Direction direction;
    private Sprite sprite;

    public AbstractMobile(final Position position, final Direction direction, final Sprite sprite) {
        this.position = position;
        this.direction = direction;
        this.sprite = sprite;
    }

    @Override
    public void move(final int width, final int height) {
        this.position = switch (this.direction) {
            case NORTH -> new Position(this.position.x(), (this.position.y() - 1 + height) % height);
            case EAST -> new Position((this.position.x() + 1) % width, this.position.y());
            case SOUTH -> new Position(this.position.x(), (this.position.y() + 1) % height);
            case WEST -> new Position((this.position.x() - 1 + width) % width, this.position.y());
        };
        //this.direction = Direction.values()[new Random().nextInt(Direction.values().length)];
    }

    @Override
    public Position getPosition() {
        return this.position;
    }

    @Override
    public ISprite getSprite() {
        return this.sprite;
    }

    @Override
    public int getY() {
        return this.position.y();
    }

    @Override
    public int getX() {
        return this.position.x();
    }

    public Direction getDirection() {
        return this.direction;
    }

    protected void setDirection(final Direction direction) {
        this.direction = direction;
    }
}
