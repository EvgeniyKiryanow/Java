package Generic;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List<Animal> listOfAnimal = new ArrayList<>();
        listOfAnimal.add(new Animal(1));
        listOfAnimal.add(new Animal(2));

        List<Dog> listOfDogs = new ArrayList<>();
        listOfDogs.add(new Dog());
        listOfDogs.add(new Dog());

        test(listOfAnimal);
        test(listOfDogs);

    }


//    private static void test(List<Animal> listOfAnimals) {
//        for(Animal animal : listOfAnimals){
//            System.out.println(animal);
//        }
//    }
    // therefore <Animal> we used WildCard => <?>
        private static void test(List<? extends Animal> listOfAnimals) {
        for(Animal animal : listOfAnimals){
            animal.eat();
            System.out.println(animal);
        }
    }
}
