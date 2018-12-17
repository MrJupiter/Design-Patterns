package Commands;
import Receiver.Volume;

public class TurnDownCommand implements Command{
    private Volume _v;
    public TurnDownCommand(Volume v){
        _v = v;
    }

    @Override
    public void execute() {
        _v.turnDown();
    }
}