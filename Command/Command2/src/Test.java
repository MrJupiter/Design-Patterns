public class Test {
    public static void main(String [] args){
        Radio radio = new Radio();
        Commands cc1 = new TurnOnRadio(radio);
        Commands cc2 = new TurnOffRadio(radio);

        TV tv = new TV();
        Commands c1 = new TurnOnTV(tv);
        Commands c2 = new TurnOffTV(tv);
        ButtonSwitch switcher = new ButtonSwitch(c1,c2);
        switcher.flipDown();
        switcher.flipUp();
        switcher.flipUp();
        switcher.flipDown();
    }
}
