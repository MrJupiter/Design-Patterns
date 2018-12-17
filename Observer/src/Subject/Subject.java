package Subject;

import Observers.Observer;

import java.util.ArrayList;
import java.util.List;

public final class Subject {
    private List<Observer> _observers = new ArrayList<>();
    private int _state;

    public int getState(){
        return _state;
    }
    public void setState(int state){
        _state = state;
        execute();
    }
    public void add(Observer observer){
        _observers.add(observer);
    }
    public void execute(){
        for(Observer observer : _observers){
            observer.update();
        }
    }
}