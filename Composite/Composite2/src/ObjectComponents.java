import java.util.ArrayList;
import java.util.List;

public class ObjectComponents implements Object {
    private List<Object> objectList;

    public ObjectComponents(){
        objectList = new ArrayList<>();
    }

    public void add(Object o){
        objectList.add(o);
    }

    @Override
    public void insert() {
        for(Object o : objectList){
            o.insert();
        }
    }
}
