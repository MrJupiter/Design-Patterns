public class Professeur extends Titre {
    public Professeur(Personne personne){super(personne);}

    @Override
    public void execute() {
        super.execute();
        System.out.println("Profession : Professeur!");
    }
}
