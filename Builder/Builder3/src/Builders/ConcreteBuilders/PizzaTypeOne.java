package Builders.ConcreteBuilders;

import Builders.PizzaBuilder;

public class PizzaTypeOne extends PizzaBuilder {
    @Override
    public void buildPate() {
        pizza.setPate("Pate of the first pizza !");
    }

    @Override
    public void buildSauce() {
        pizza.setSauce("Sauce of the first pizza !");
    }

    @Override
    public void buildGarniture() {
        pizza.setGarniture("Garniture of the first pizza !");
    }
}
