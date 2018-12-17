package Builders.ConcreteBuilders;

import Builders.PizzaBuilder;

public class PizzaTypeTwo extends PizzaBuilder {
    @Override
    public void buildPate() {
        pizza.setPate("Pate of the second pizza !");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Sauce of the second pizza !");
    }

    @Override
    public void buildGarniture() {
        pizza.setGarniture("Garniture of the second pizza !");
    }
}
