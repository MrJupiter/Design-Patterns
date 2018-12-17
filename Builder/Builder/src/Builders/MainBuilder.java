package Builders;

import Product.Building;

public interface MainBuilder {
    void buildWalls();
    void buildRoof();
    void buildWindows();
    void buildDoor();
    void buildSwimmingPool(boolean t);
    void buildToilette(boolean t);
    void createBuilding();
    Building getBuilding();
}
