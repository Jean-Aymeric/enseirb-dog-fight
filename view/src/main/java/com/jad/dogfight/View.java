package com.jad.dogfight;


import com.jad.dogfight.view.ActionStates;
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

    @Override
    public boolean isPlayer1WillingToTurnLeft() {
        boolean result = ActionStates.LEFT_PLAYER_1.isPressed();
        ActionStates.LEFT_PLAYER_1.release();
        return result;
    }

    @Override
    public boolean isPlayer1WillingToTurnRight() {
        boolean result = ActionStates.RIGHT_PLAYER_1.isPressed();
        ActionStates.RIGHT_PLAYER_1.release();
        return result;
    }

    @Override
    public boolean isPlayer2WillingToTurnLeft() {
        boolean result = ActionStates.LEFT_PLAYER_2.isPressed();
        ActionStates.LEFT_PLAYER_2.release();
        return result;
    }

    @Override
    public boolean isPlayer2WillingToTurnRight() {
        boolean result = ActionStates.RIGHT_PLAYER_2.isPressed();
        ActionStates.RIGHT_PLAYER_2.release();
        return result;
    }
}
