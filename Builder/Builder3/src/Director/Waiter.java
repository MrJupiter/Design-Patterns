package Director;

import Builders.PizzaBuilder;
import Products.Pizza;

public class Waiter {
    private PizzaBuilder pizzaBuilder;

    private void setPizzaBuildera(PizzaBuilder p){pizzaBuilder = p;}
    public Pizza getPizza(){return pizzaBuilder.getPizza();}

    public void preparePizza(PizzaBuilder b){
        setPizzaBuildera(b);
        pizzaBuilder.createNewPizza();
        pizzaBuilder.buildPate();
        pizzaBuilder.buildSauce();
        pizzaBuilder.buildGarniture();
    }
}
