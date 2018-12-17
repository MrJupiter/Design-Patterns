final class Hache extends Arme {
    public Hache( Combattant component ) {
        super(component);
    }

    @Override
    public void combattre() {
        super.combattre();
        System.out.println(" avec une hâche");
    }
}