import Commands.*;
import Invoker.Switch;
import Receiver.*;

/* Classe de test */
public class TestCommand{
    public static void main(String[] args){
        Light light = new Light();
        Command c1 = new TurnOnCommand(light);
        Command c2 = new TurnOffCommand(light);
        Switch s = new Switch(c1,c2);
        s.flipDown();
        s.flipUp();
        s.flipDown();
        Volume volume = new Volume();
        Command c3 = new TurnUpCommand(volume);
        Command c4 = new TurnDownCommand(volume);
        Switch s1 = new Switch(c3,c4);
        s1.flipUp();
        s1.flipDown();
    }
}