public class Test {
    public static void main(String [] args){
        ObjectComponents objectComponents = new ObjectComponents();
        objectComponents.add(new MotherBoard());
        objectComponents.add(new CPU());
        objectComponents.add(new RAM());
        objectComponents.add(new GPU());
        objectComponents.add(new OS());
        objectComponents.insert();
    }
}
