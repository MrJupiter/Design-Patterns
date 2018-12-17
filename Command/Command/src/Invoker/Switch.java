package Invoker;

import Commands.Command;

public class Switch{

    private Command _c1 ;
    private Command _c2;
    public Switch(Command c1, Command c2){
        _c1 = c1;
        _c2 = c2;
    }
    public void flipUp(){
        _c1.execute();
    }
    public void flipDown(){
        _c2.execute();
    }
}