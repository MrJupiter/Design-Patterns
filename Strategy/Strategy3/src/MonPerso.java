public class MonPerso {
    private Strategy strategy;

    public MonPerso(Strategy s){
        strategy = s;
    }

    public void execute(){
        strategy.update();
    }
}
