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
