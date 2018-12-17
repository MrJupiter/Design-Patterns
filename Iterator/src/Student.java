public class Student implements Objects {
    private String name;
    private String level;
    private int i=0;
    public Student(String n, String l,int i){
        name = n;
        level = l;
        this.i = i;
    }

    @Override
    public String toString() {
        return ">>> Student ID: "+i+"\n\t\tName: "+name +"\n\t\tLevel: "+level;
    }
}
