public class TurnOffTV implements Commands{
    private TV _tv;
    public TurnOffTV(TV tv){
        _tv = tv;
    }

    @Override
    public void execute() {
        _tv.turnOff();
    }
}
