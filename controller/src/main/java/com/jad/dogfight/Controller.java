package com.jad.dogfight;

public class Controller implements IController {
    private final IView view;
    private final IModel model;

    public Controller(final IView view, final IModel model) {
        this.view = view;
        this.model = model;
    }

    @Override
    public void start() {
        this.view.display(this.model.getData());
    }
}
