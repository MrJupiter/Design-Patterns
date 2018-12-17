package Client;

import Builders.ConcreteBuilders.PizzaTypeOne;
import Builders.ConcreteBuilders.PizzaTypeTwo;
import Director.Waiter;

public class Client {
    public static void main(String [] args){
        Waiter w = new Waiter();

        w.preparePizza(new PizzaTypeOne());

        System.out.println("The first Type Pizza: ");
        System.out.println(w.getPizza().toString());

        w.preparePizza(new PizzaTypeTwo());

        System.out.println("The second Type Pizza: ");
        System.out.println(w.getPizza().toString());
    }
}
