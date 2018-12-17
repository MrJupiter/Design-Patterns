package ConcreteProducts.VictorianStyle;

import Products.Sofa;

public class VictorianStyleSofa implements Sofa {
    @Override
    public void talk() {
        System.out.println("I am an VictorianStyle sofa!");
    }
}