package Leafs;

import Composant.Graphic;

public class Ellipse implements Graphic {
    @Override
    public void drawMe() {
        System.out.println("I am an Ellipse!");
    }
}