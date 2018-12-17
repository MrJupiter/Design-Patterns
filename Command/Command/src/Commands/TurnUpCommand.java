package Commands;
import Receiver.Volume;

public class TurnUpCommand implements Command{
    private Volume _v;
    public TurnUpCommand(Volume v){
        _v = v;
    }

    @Override
    public void execute() {
        _v.turnUp();
    }
}
