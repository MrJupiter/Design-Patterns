package Leafs;

import Composant.Graphic;

public class Square implements Graphic {
    @Override
    public void drawMe() {
        System.out.println("I am a Square!");
    }
}