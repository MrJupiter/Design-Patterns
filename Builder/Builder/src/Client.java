import Builders.Concrete.RoomBuilder;
import Builders.MainBuilder;
import Director.BuildingsDirector;
import Product.Building;

public class Client {
    public static void main(String[] args) {
        BuildingsDirector director = new BuildingsDirector(new RoomBuilder());
//        MainBuilder m = new RoomBuilder();
//        director.setMainBuilder(m);
        director.buildRoom();
        Building room = director.getBuilding();

        System.out.println(room.toString());

    }
}
