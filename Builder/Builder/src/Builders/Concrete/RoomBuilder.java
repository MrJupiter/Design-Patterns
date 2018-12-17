package Builders.Concrete;

import Builders.MainBuilder;
import Product.Building;

public class RoomBuilder implements MainBuilder {
     private Building building;

    @Override
    public void buildDoor() {
        building.setDoors(1);
    }

    @Override
    public void buildRoof() {
        building.setRoof(true);
    }

    @Override
    public void buildSwimmingPool(boolean t) {
        building.setSwimmingPool(t);
    }

    @Override
    public void buildToilette(boolean t) {
        building.setToilette(t);
    }

    @Override
    public void buildWalls() {
        building.setWalls(4);
    }

    @Override
    public void buildWindows() {
        building.setWindows(1);
    }

    @Override
    public void createBuilding() {
        building = new Building();
    }

    @Override
    public Building getBuilding() {
        return building;
    }
}
