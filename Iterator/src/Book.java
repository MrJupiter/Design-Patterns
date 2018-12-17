public class Book implements Objects{
    private String name;
    private String publication;

    public Book(String name, String publication){
        this.publication=publication;
        this.name = name;
    }
    public String getPublication() {
        return publication;
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName()+ ": "+name + ", " + publication;
    }
}