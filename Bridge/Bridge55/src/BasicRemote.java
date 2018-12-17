public class BasicRemote implements DevicesRemote {
    private Devices device;
    public BasicRemote(Devices d){
        device = d;
    }

    @Override
    public void channelDown() {
        if(device.getChannel() != 0)
            System.out.println("Channel-- !");
            device.setChannel(device.getChannel()-1);
    }
    @Override
    public void channelUp() {
        System.out.println("Channel++ !");
        device.setChannel(device.getChannel()+1);
    }

    @Override
    public void turnOff() {
        if(device.isEnable()){
            System.out.println("DEVICE TURNED OFF!");
            device.desable();
        }
    }
    @Override
    public void turnOn() {
        if(!device.isEnable()){
            System.out.println("DEVICE TURNED ON!");
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        if(device.getVolume()>0){
            System.out.println("Volume-- !");
            device.setVolume(device.getVolume()-1);
        }
    }
    @Override
    public void volumeUp() {
        if(device.getVolume()<=100){
            System.out.println("Volume++ !");
            device.setVolume(device.getVolume()+1);
        }
    }

    @Override
    public String toString() {
        return "Mode: "+ ((device.getMode())?"ON\n":"OFF\n") +"Volume: "+device.getVolume()+"\nChannel: "+device.getChannel();
    }
}
