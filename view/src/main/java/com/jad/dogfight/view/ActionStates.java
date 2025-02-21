package com.jad.dogfight.view;

public enum ActionStates {
    LEFT_PLAYER_1("left-p1", false),
    RIGHT_PLAYER_1("right-p1", false),
    LEFT_PLAYER_2("left-p2", false),
    RIGHT_PLAYER_2("right-p2", false),
    EXIT("exit", false);

    @SuppressWarnings("FieldNamingConvention")
    private final String key;
    private boolean isPressed;

    @SuppressWarnings("SameParameterValue")
    ActionStates(final String key, final boolean isPressed) {
        this.key = key;
        this.isPressed = isPressed;
    }

    public String getKey() {
        return this.key;
    }

    public boolean isPressed() {
        return this.isPressed;
    }

    public void pressed() {
        this.isPressed = true;
    }

    public void released() {
        this.isPressed = false;
    }
}

