public class TurnOnTV implements Commands{
    private TV _tv;
    public TurnOnTV(TV tv){
        _tv = tv;
    }
    @Override
    public void execute() {
        _tv.turnOn();
    }
}
