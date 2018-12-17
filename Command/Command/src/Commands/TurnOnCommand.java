package Commands;

import Receiver.Light;

/* Commande concrète pour allumer la lumière */
public class TurnOnCommand implements Command{
    Light theLight ;

    public TurnOnCommand(Light light){
        theLight = light;
    }
    @Override
    public void execute() {
        theLight.turnOn();
    }
}