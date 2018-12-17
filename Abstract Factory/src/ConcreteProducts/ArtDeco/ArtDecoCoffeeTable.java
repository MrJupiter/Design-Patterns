package ConcreteProducts.ArtDeco;

import Products.CoffeeTable;

public class ArtDecoCoffeeTable implements CoffeeTable {
    @Override
    public void talk() {
        System.out.println("I am an ArtDeco coffee table!");
    }
}