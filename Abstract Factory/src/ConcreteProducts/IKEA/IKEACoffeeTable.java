package ConcreteProducts.IKEA;

import Products.CoffeeTable;

public class IKEACoffeeTable implements CoffeeTable {
    @Override
    public void talk() {
        System.out.println("I am an IKEA coffee table!");
    }
}

