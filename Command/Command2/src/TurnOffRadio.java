public class TurnOffRadio implements Commands {
    private Radio _radio;
    public TurnOffRadio(Radio radio){
        _radio = radio;
    }

    @Override
    public void execute() {
        _radio.turnOff();
    }
}
