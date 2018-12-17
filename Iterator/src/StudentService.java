import java.util.ArrayList;
import java.util.List;

public class StudentService implements Service {
    private List<Student> studentList = new ArrayList<>();

    @Override
    public MyIterator getIterator() {
        return new StudentIterator();
    }
    public void add(Student s){
        studentList.add(s);
    }
    private class StudentIterator implements MyIterator{
        private int index = 0;

        @Override
        public Objects next() {
            Student s = studentList.get(index);
            index++;
            return s;
        }

        @Override
        public boolean hasMore() {
            return index < studentList.size();
        }
    }
}
