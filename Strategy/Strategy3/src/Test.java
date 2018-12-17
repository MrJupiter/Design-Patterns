public class Test {
    public static void main(String [] args){
        Strategy sr = new Sacrieur();
        MonPerso monPerso = new MonPerso(sr);
        monPerso.execute();
    }
}
