public class Test {
    public static void main(String [] args){
        Human human = Human.getInstance();
        try {
            Gender homme = human.get("man");
            Gender femme = human.get("woman");
//            Gender machin = human.get("nanaan");

            homme.introduce();
            femme.introduce();
//            machin.introduce();
        }catch(GenderException e){
            System.out.println(e.getMessage());
        }
    }
}
