package Factories;

import Products.*;

public interface AbstractFactory {
    Chair createChair();
    CoffeeTable createCoffeeTable();
    Sofa createSofa();
}
