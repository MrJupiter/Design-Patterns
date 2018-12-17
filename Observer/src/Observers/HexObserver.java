package Observers;

import Subject.Subject;

public final class HexObserver extends Observer {

    public HexObserver(Subject subject){
        _subject = subject;
        _subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(">>> Hexa: " + Integer.toHexString(_subject.getState()));
    }
}
