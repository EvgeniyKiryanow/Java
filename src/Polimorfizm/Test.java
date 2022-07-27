package Polimorfizm;

public class Test {
    public static void main(String[] args) {
        Animal animal = new Animal();
        //    upcasting because Animal => Dog look for this obj from parent
        Animal animal2 = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();

        test(cat);
        test(dog);
        test(animal);
//        animal.eat();
//        dog is eating => because in Dog we rewrote method eat

//        animal.bark(); => not work
//        Dog dog = new Dog();
//        dog.eat();
//        dog.bark();

    }

    public static void test(Animal animal){
        animal.eat();
    }
}
