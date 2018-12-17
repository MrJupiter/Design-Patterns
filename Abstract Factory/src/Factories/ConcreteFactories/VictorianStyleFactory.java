package Factories.ConcreteFactories;

import Factories.AbstractFactory;
import Products.*;
import ConcreteProducts.VictorianStyle.*;

public class VictorianStyleFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new VictorianStyleChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new VictorianStyleCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new VictorianStyleSofa();
    }
}
