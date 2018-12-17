public class Test {
    public static void main(String [] args){
        Factory factory = Factory.getInstance();

        Human man = factory.getHuman("MAN");
        Human woman = factory.getHuman("WOMAN");

        man.introduce();
        woman.introduce();
    }
}
