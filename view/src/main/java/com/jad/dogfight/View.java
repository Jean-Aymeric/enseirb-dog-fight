package com.jad.dogfight;


import com.jad.dogfight.view.Screen;

public class View implements IView {
    private IModel model;
    private Screen screen;

    @Override
    public void displayScreen() {
        for (int y = 0; y < this.model.getHeight(); y++) {
            for (int x = 0; x < this.model.getWidth(); x++) {
                System.out.print(this.model.getSpriteAtXY(x, y));
            }
            System.out.println();
        }
    }

    @Override
    public void setModel(final IModel model) {
        this.model = model;
    }
}
