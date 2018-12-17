package Director;

import Builders.MainBuilder;
import Builders.Concrete.RoomBuilder;
import Product.Building;

import java.util.ArrayList;
import java.util.List;

public class BuildingsDirector {
    private MainBuilder mainBuilder;

    public BuildingsDirector(MainBuilder b){mainBuilder = b;}

    public void setMainBuilder(MainBuilder b){mainBuilder = b;}

    public Building getBuilding(){return mainBuilder.getBuilding();}

    public void buildRoom(){
        mainBuilder.createBuilding();
        mainBuilder.buildWalls();
        mainBuilder.buildRoof();
        mainBuilder.buildDoor();
        mainBuilder.buildWindows();
        mainBuilder.buildToilette(true);
        mainBuilder.buildSwimmingPool(true);
    }
    public List<Building> buildFlat(){
        BuildingsDirector director = new BuildingsDirector(new RoomBuilder());
//        MainBuilder m = new RoomBuilder();
//        director.setMainBuilder(m);
        director.buildRoom();

        List<Building> flat = new ArrayList<>();
        for(int i=0; i<5; i++) flat.add(director.getBuilding());
        return flat;
    }
}
