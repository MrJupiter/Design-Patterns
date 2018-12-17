package Factory.Tests;

import Factory.Classes.*;

public class TestFactory {
    public static void main(String[] args) {

        FabriqueAnimal f = FabriqueAnimal.getInstance();
        Animal chien = f.getAnimal("chien");
        Animal chat = f.getAnimal("chat");
        Animal machin = f.getAnimal("chelou");

        chien.introduce();
        if(chat!=null) chat.introduce();
        if(machin!=null) machin.introduce();
    }
}
