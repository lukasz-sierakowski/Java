package zoo;

import zoo.animals.birds.AbstractBird;
import zoo.animals.birds.Canary;
import zoo.animals.birds.Eagle;
import zoo.animals.mammals.Bear;
import zoo.animals.mammals.Goat;
import zoo.stuff.BirdKeeper;

import java.util.Arrays;

public class ZooApplication {

  public static void main(String[] args) {
    Bear bear = new Bear(100, "Teddy");

    Eagle eagle1 = new Eagle(20, "Anne");
    Eagle eagle2 = new Eagle(20, "Alex");

    BirdKeeper john = new BirdKeeper(Arrays.asList(eagle1, eagle2), "John", 33);

    //playtime
    john.getAnimals().forEach(john::playWithAnimal);

    //the same as
    for (AbstractBird animal : john.getAnimals()) {
      john.playWithAnimal(animal);
    }

    Canary rainha = new Canary(1, "Rainha");

    rainha.eat(9); // kanarek tyje dopiero od 10kg jedzenia, ale za to kilo od razu :D
    System.out.println(rainha.getWeight());

    Goat greg = new Goat(55, "Greg");

    Bear yogi = new Bear(400, "Yogi");

    System.out.println(yogi.getName() + " & " + greg);
    /*TODO
    Stworzyć:
    Kanarek

    AbstractAnimal
      AbstractMammal -> abstract getNewAnimal(name) ->

        Koza
        Bear
        Foka

    AnimalKeeper<AbstractMammal>

    Zatrudnij Anne ^ i każ jej karmić zwierzęta, oraz odbierać porody

    */
  }
}
