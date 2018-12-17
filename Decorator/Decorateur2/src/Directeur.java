public class Directeur extends Titre {
    public Directeur(Personne personne){super(personne);}

    @Override
    public void execute() {
        super.execute();
        System.out.println("Profession : Directeur!");
    }
}
