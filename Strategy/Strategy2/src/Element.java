public class Element {
    private IStrategie strategie;

    public void setStrategie(IStrategie strategie) {
        this.strategie = strategie;
    }

    public void execute(){
        strategie.execute();
    }
}
