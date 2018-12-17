package Products;

public class Pizza {
    private String sauce = "";
    private String pate = "";
    private String garniture = "";

    public void setSauce(String s){sauce = s;}
    public void setPate(String s){pate = s;}
    public void setGarniture(String s){garniture = s;}

    @Override
    public String toString() {
        return "\tSauce : " + sauce + "\n\tPate : " + pate + "\n\tGarnitutre : " + garniture ;
    }
}
