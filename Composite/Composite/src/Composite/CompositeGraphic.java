package Composite;

import Composant.Graphic;
import java.util.ArrayList;
import java.util.List;

public class CompositeGraphic implements Graphic {
    private List<Graphic> graphics= new ArrayList<Graphic>();

    public void add(Graphic g){
        graphics.add(g);
    }
    public void remove(Graphic g){
        graphics.remove(g);
    }

    @Override
    public void drawMe() {
        for(Graphic g : graphics){
            g.drawMe();
        }
    }
}