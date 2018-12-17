package Observers;

import Subject.Subject;

public final class BinObserver extends Observer {

    public BinObserver(Subject subject){
        _subject = subject;
        _subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(">>> Bin: " + Integer.toBinaryString(_subject.getState()));
    }

}

