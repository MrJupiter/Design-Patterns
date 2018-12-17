package Product;

public class Building {
    private int walls;
    private boolean roof;
    private int windows;
    private int doors;
    private boolean swimmingPool;
    private boolean toilette;

    public void setWalls(int w){walls = w;}
    public void setRoof(boolean bool){roof = bool;}
    public void setWindows(int i){windows = i;}
    public void setDoors(int i){doors = i;}
    public void setSwimmingPool(boolean i){swimmingPool = i;}
    public void setToilette(boolean i){toilette = i;}

    @Override
    public String toString() {
        String s = "The room is a composite of: \n>>> "+walls+" walls.\n>>> "+doors+" doors.\n>>> "+windows+" windows.\n";
        if(roof)
            s += ">>> 1 roof.\n";
        if(swimmingPool)
            s += ">>> 1 swimming pool.\n";
        if(toilette)
            s += ">>> 1 toilette.\n";
        return s;
    }
}
