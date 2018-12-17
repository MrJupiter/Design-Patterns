public interface Devices {
    boolean isEnable();
    void enable();
    void desable();
    void setVolume(int volume);
    void setChannel(int channel);
    int getChannel();
    int getVolume();
    boolean getMode();
}
