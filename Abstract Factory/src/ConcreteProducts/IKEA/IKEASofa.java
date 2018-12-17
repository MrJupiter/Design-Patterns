package ConcreteProducts.IKEA;

import Products.Sofa;

public class IKEASofa implements Sofa {
    @Override
    public void talk() {
        System.out.println("I am an IKEA sofa!");
    }
}
