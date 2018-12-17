import Observers.*;
import Subject.Subject;

public class ObserverDemo {
    public static void main( String[] args ) {
        Subject subject = new Subject();
        new OctObserver(subject);
        new BinObserver(subject);
        new HexObserver(subject);

        subject.setState(8);

        subject.setState(18);

    }
}