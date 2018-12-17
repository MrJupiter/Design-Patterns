public class TV implements Devices {
    private int _volume=30;
    private int _channel=254;
    private boolean _mode=false;

    @Override
    public boolean getMode(){
        return _mode;
    }
    @Override
    public void enable() {
        _mode = true;
    }
    @Override
    public void desable() {
        _mode = false;
    }
    @Override
    public boolean isEnable() {
        return _mode;
    }

    @Override
    public int getChannel() {
        return _channel;
    }

    @Override
    public int getVolume() {
        return _volume;
    }

    @Override
    public void setChannel(int channel) {
        _channel = channel;
    }

    @Override
    public void setVolume(int volume) {
        _volume = volume;
    }
}
