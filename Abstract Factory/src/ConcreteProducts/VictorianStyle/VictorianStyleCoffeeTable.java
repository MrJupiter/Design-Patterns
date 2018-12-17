package ConcreteProducts.VictorianStyle;

import Products.CoffeeTable;

public class VictorianStyleCoffeeTable implements CoffeeTable {
    @Override
    public void talk() {
        System.out.println("I am an VictorianStyle coffee table!");
    }
}
