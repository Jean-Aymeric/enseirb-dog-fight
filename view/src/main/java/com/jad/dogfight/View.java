package com.jad.dogfight;


import com.jad.dogfight.view.Screen;

public class View implements IView {
    private IModel model;
    private Screen screen;

    @Override
    public void displayScreen() {
        this.screen = new Screen(this.model.getWidth(),
                                 this.model.getHeight(),
                                 this.model.getEmptyPixel());
        for (IMobile mobile : this.model.getAllMobiles()) {
            this.screen.setSpriteAtXY(mobile.getX(),
                                      mobile.getY(),
                                      mobile.getSprite());
        }
        System.out.println(this.screen.getText());
    }

    @Override
    public void setModel(final IModel model) {
        this.model = model;

    }
}
