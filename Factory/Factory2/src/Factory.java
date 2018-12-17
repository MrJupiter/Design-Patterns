public class Factory {
    private Factory(){}
    private static class FactoryHamming{
        private final static Factory factoryInstance = new Factory();
    }
    public static Factory getInstance(){
        return FactoryHamming.factoryInstance;
    }

    public Human getHuman(String human){
        if(human.equalsIgnoreCase("man")){
            return new Man();
        }else if(human.equalsIgnoreCase("woman")){
            return new Woman();
        }else{
            System.err.println("HUMAN LIST ONLY CONTAINS MAN AND WOMAN!");
            return null;
        }
    }

}
