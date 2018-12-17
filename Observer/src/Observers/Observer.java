package Observers;

import Subject.Subject;

public abstract class Observer {
    protected Subject _subject;
    public abstract void update();
}