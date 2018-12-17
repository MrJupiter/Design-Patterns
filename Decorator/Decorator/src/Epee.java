final class Epee extends Arme {
    public Epee( Combattant component ) {
        super(component);
    }

    @Override
    public void combattre() {
        super.combattre();
        System.out.println(" avec une épée");
    }
}