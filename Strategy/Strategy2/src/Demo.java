public class Demo {
    public static void main(String[] args){
        Element e = new Element();
        IStrategie s1 = new AlgorithmeA();
        e.setStrategie(s1);
        e.execute();

        IStrategie s2 = new AlgorithmeC();
        e.setStrategie(s2);
        e.execute();
    }
}
