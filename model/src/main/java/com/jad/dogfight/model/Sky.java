package com.jad.dogfight.model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Sky {
    private final Dimension dimension;
    private final List<IMobile> mobiles = new ArrayList<IMobile>();

    public Sky(final int width, final int height) {
        this.dimension = new Dimension(width, height);
    }

    public final void addMobile(final IMobile mobile) {
        this.mobiles.add(mobile);
    }
}
