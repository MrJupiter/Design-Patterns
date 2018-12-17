package ConcreteProducts.VictorianStyle;

import Products.Chair;

public class VictorianStyleChair implements Chair {
    @Override
    public void talk() {
        System.out.println("I am an VictorianStyle chair!");
    }
}