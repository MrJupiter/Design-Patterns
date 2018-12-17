abstract class Arme extends Combattant {
    private Combattant _component;

    protected Arme( Combattant component ) {
        _component = component;
    }

    @Override
    public void combattre() {
        _component.combattre();
    }
}