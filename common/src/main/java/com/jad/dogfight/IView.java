package com.jad.dogfight;

public interface IView {
    void displayScreen();

    void setModel(final IModel model);

    boolean isPlayer1WillingToTurnLeft();

    boolean isPlayer1WillingToTurnRight();

    boolean isPlayer2WillingToTurnLeft();

    boolean isPlayer2WillingToTurnRight();
}
