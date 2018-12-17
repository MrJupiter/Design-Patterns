final class Arc extends Arme {
    public Arc( Combattant component ) {
        super(component);
    }

    @Override
    public void combattre() {
        super.combattre();
        System.out.println(" avec un arc");
    }
}