public class Test {
    public static void main(String [] args){
        DevicesRemote devicesRemote = new BasicRemote(new TV());
        devicesRemote.turnOff();
        devicesRemote.turnOn();
        devicesRemote.turnOff();
        devicesRemote.turnOn();
        devicesRemote.volumeDown();
        devicesRemote.channelUp();
        System.out.println("DEVICE STATE:");
        System.out.println(devicesRemote);
    }
}
