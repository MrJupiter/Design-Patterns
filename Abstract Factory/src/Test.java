import Factories.*;
import Factories.ConcreteFactories.*;
import Products.*;

public class Test {
    public static void main(String [] args){
        AbstractFactory af1 = Corporation("ArtDeco");
        AbstractFactory af2 = Corporation("VictorianStyle");
        AbstractFactory af3 = Corporation("IKEA");

        Chair c1 = af1.createChair();
        Sofa s1 = af1.createSofa();
        CoffeeTable ct1 = af1.createCoffeeTable();
        Chair c2 = af2.createChair();
        Sofa s2 = af2.createSofa();
        CoffeeTable ct2 = af1.createCoffeeTable();
        Chair c3 = af3.createChair();
        Sofa s3 = af3.createSofa();
        CoffeeTable ct3 = af3.createCoffeeTable();

        System.out.println("ArtDeco :");
        s1.talk();
        c1.talk();
        ct1.talk();
        System.out.println("VictorianStyle :");
        s2.talk();
        c2.talk();
        ct2.talk();
        System.out.println("IKEA :");
        s3.talk();
        c3.talk();
        ct3.talk();
    }
    public static AbstractFactory Corporation(String corpo){
        if(corpo.equals("IKEA")){
            return new IKEAFactory();
        }else if(corpo.equals("VictorianStyle")){
            return new VictorianStyleFactory();
        }else if(corpo.equals("ArtDeco")){
            return new ArtDecoFactory();
        }else{
            System.err.println("Corps list only contains: IKEA, VictorianStyle and ArtDeco");
            return null;
        }
    }
}
