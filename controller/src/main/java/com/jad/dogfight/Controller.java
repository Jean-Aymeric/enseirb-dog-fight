package com.jad.dogfight;

public class Controller implements IController {
    private final IView view;
    private final IModel model;
    private boolean running = true;

    public Controller(final IView view, final IModel model) {
        this.view = view;
        this.model = model;
        this.view.setModel(this.model);
    }

    @Override
    public void start() {
        while (this.running) {
            this.view.displayScreen();
            this.model.movesAllMobiles();
            if (this.view.isPlayer1WillingToTurnLeft()) this.model.turnLeft(1);
            if (this.view.isPlayer1WillingToTurnRight()) this.model.turnRight(1);
            if (this.view.isPlayer2WillingToTurnLeft()) this.model.turnLeft(2);
            if (this.view.isPlayer2WillingToTurnRight()) this.model.turnRight(2);
            synchronized (this) {
                long i = 0;
                while (i < 50000000) {
                    i++;
                }
            }
            // this.running = false;
        }
    }
}
