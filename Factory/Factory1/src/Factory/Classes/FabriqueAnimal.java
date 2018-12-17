package Factory.Classes;

public class FabriqueAnimal {
    private FabriqueAnimal(){}
    private static class FabriqueAnimalHolder{
        private final static FabriqueAnimal a = new FabriqueAnimal();
    }
    public static FabriqueAnimal getInstance(){
        return FabriqueAnimalHolder.a;
    }
    public Animal getAnimal(String animal){
        if(animal.equals("chat")){
            return new Chat();
        }else if(animal.equals("chien")){
            return new Chien();
        }else{
            System.err.println("Votre list de choix ne contient que \"chat\" ou \"chien\"!");
            return null;
        }
    }
}
