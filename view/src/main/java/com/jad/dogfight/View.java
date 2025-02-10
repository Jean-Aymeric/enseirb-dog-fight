package com.jad.dogfight;

public class View implements IView {
    @Override
    public void display(final String textToDisplay) {
        System.out.println(textToDisplay);
    }
}
