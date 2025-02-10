package com.jad.dogfight.model;

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

    protected Direction getDirection() {
        return this.direction;
    }

    protected void setDirection(final Direction direction) {
        this.direction = direction;
    }

    @Override
    public void move() {
        this.position = switch (this.direction) {
            case NORTH -> new Position(this.position.x(), this.position.y() - 1);
            case EAST -> new Position(this.position.x() + 1, this.position.y());
            case SOUTH -> new Position(this.position.x(), this.position.y() + 1);
            case WEST -> new Position(this.position.x() - 1, this.position.y());
        };
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
}
