package com.jad;

import com.jad.dogfight.Controller;
import com.jad.dogfight.IView;
import com.jad.dogfight.Model;
import com.jad.dogfight.View;


public class Main {
    public static void main(String[] args) {
        IView view = new View();
        Model model = new Model();
        Controller controller = new Controller(view, model);
        controller.start();
    }
}