package com.jad.dogfight;


import com.jad.dogfight.view.Screen;
import com.jad.dogfight.view.TextWindow;

public class View implements IView {
    private final TextWindow textWindow;
    private IModel model;
    private Screen screen;

    public View() {
        this.textWindow = new TextWindow("Dog Fight");
    }

    @Override
    public void displayScreen() {
        this.screen = new Screen(this.model.getWidth(),
                                 this.model.getHeight(),
                                 this.model.getEmptyPixel());
        for (IMobile mobile : this.model.getAllMobiles()) {
            this.screen.setSpriteAtXY(mobile.getX(),
                                      mobile.getY(),
                                      mobile.getSprite(),
                                      mobile.getDirection());
        }
        this.textWindow.setScreen(this.screen.getText());
    }

    @Override
    public void setModel(final IModel model) {
        this.model = model;

    }
}
