package Commands;

import Receiver.Light;

/* Commande concrète pour éteindre la lumière */
public class TurnOffCommand implements Command{
    Light theLight ;

    public TurnOffCommand(Light light){
        theLight = light;
    }
    @Override
    public void execute() {
        theLight.turnOff();
    }
}