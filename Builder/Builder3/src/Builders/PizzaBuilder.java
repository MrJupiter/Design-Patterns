package Builders;

import Products.Pizza;

public abstract class PizzaBuilder {
    protected Pizza pizza;

    public Pizza getPizza(){return pizza;}
    public void createNewPizza(){pizza = new Pizza();}

    public abstract void buildPate();
    public abstract void buildSauce();
    public abstract void buildGarniture();
}
