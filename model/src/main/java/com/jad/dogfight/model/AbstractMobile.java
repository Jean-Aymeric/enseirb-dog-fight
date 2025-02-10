package com.jad.dogfight.model;

import com.jad.dogfight.Position;

public abstract class AbstractMobile implements IMobile {
    private Position position;
    private Direction direction;

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
}
