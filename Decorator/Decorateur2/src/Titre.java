public abstract class Titre implements Personne{
    protected Personne _personne;
    protected Titre(Personne personne){
        _personne = personne;
    }

    @Override
    public void execute() {
        _personne.execute();
    }
}
