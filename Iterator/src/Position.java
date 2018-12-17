public class Position implements Objects{
    private int _X;
    private int _Y;
    public Position(int x, int y){
        _X = x;
        _Y = y;
    }

    @Override
    public String toString() {
        return "("+_X+", "+_Y+")";
    }
}
