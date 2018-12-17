package ConcreteProducts.IKEA;

import Products.Chair;

public class IKEAChair implements Chair {
    @Override
    public void talk() {
        System.out.println("I am an IKEA chair!");
    }
}

