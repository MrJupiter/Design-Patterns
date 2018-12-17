package Client;

import Abstractions.*;
import Implementations.*;

public class Demo {
    public static void main(String[] args) {

        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(new Tv());
        basicRemote.power();
        basicRemote.volumeDown();
        basicRemote.channelDown();
        basicRemote.channelUp();
        basicRemote.getDevice().printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(new Tv());
        advancedRemote.power();
        advancedRemote.mute();
        advancedRemote.volumeUp();

        advancedRemote.getDevice().printStatus();
    }

}