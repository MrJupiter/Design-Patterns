public class ButtonSwitch {
    private Commands _c1;
    private Commands _c2;
    public ButtonSwitch(Commands c1, Commands c2){
        _c1 = c1;
        _c2 = c2;
    }
    public void flipUp(){
        _c1.execute();
    }
    public void flipDown(){
        _c2.execute();
    }
}
