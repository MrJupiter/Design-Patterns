package Factories.ConcreteFactories;

import Factories.AbstractFactory;
import Products.*;
import ConcreteProducts.IKEA.*;

public class IKEAFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new IKEAChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new IKEACoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new IKEASofa();
    }
}

