public class TurnOnRadio implements Commands {
    private Radio _radio;
    public TurnOnRadio(Radio radio){
        _radio = radio;
    }

    @Override
    public void execute() {
        _radio.turnOn();
    }
}
