import Composant.Graphic;
import Composite.CompositeGraphic;
import Leafs.*;

public class Main{
    public static void main(String[] args){
        CompositeGraphic graphics1 = new CompositeGraphic();
        CompositeGraphic graphics2 = new CompositeGraphic();

        Graphic ellipse1 = new Ellipse();
        Graphic cercle1 = new Cercle();
        Graphic square1 = new Square();

        graphics1.add(ellipse1);
        graphics1.add(square1);
        graphics1.add(cercle1);

        graphics2.add(ellipse1);
        graphics2.add(graphics1);
        graphics2.add(cercle1);

        graphics2.drawMe();

    }
}