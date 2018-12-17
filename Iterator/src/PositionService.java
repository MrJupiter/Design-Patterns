import java.util.ArrayList;
import java.util.List;

public class PositionService implements Service {
    List<Position> positions = new ArrayList<>();

    public MyIterator getIterator(){
        return new PositionIterator();
    }
    public void add(Position p ){
        positions.add(p);
    }


    private class PositionIterator implements MyIterator{
        private int index=0;

        @Override
        public Position next() {
            Position p = positions.get(index);
            index++;
            return p;
        }

        @Override
        public boolean hasMore() {
            if(index < positions.size()){
                return true;
            }
            return false;
        }

    }
}
