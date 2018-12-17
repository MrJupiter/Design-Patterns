public final class Decorateur {
    public static void main( String[] args ) {
        Combattant c1 = new Hache(new Epee(new Arc(new Chevalier())));
        c1.combattre();
    }
}