public class Human {
    private Human(){}
    private static class HumanHolder{
        private final static Human instance = new Human();
    }
    public static Human getInstance(){
        return HumanHolder.instance;
    }
    public Gender get(String gender) throws GenderException{
        if (gender.equalsIgnoreCase("man")) {
            return new Man();
        } else if (gender.equalsIgnoreCase("woman")) {
            return new Woman();
        }else{
            throw new GenderException();
        }
    }

}
