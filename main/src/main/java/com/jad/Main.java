package com.jad;

import com.jad.dogfight.*;


public class Main {
    public static void main(String[] args) {
        IView view = new View();
        IModel model = new Model();
        IController controller = new Controller(view, model);
        controller.start();
    }
}