package Observers;

import Subject.*;

public final class OctObserver extends Observer {

    public OctObserver(Subject subject){
        _subject = subject;
        _subject.add(this);
    }

    @Override
    public void update() {
        System.out.println(">>> Octa: " + Integer.toOctalString(_subject.getState()));
    }
}