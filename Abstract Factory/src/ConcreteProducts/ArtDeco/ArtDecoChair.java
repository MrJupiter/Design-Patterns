package ConcreteProducts.ArtDeco;

import Products.Chair;

public class ArtDecoChair implements Chair {
    @Override
    public void talk() {
        System.out.println("I am an ArtDeco chair!");
    }
}
