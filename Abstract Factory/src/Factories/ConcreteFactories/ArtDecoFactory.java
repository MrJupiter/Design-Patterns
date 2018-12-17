package Factories.ConcreteFactories;

import Factories.AbstractFactory;
import Products.*;
import ConcreteProducts.ArtDeco.*;

public class ArtDecoFactory implements AbstractFactory {
    @Override
    public Chair createChair() {
        return new ArtDecoChair();
    }

    @Override
    public CoffeeTable createCoffeeTable() {
        return new ArtDecoCoffeeTable();
    }

    @Override
    public Sofa createSofa() {
        return new ArtDecoSofa();
    }
}