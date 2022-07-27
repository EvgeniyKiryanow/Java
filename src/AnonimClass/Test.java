package AnonimClass;

interface AbleToEat {
    public void eat();
}

class Animal implements AbleToEat {
    @Override
    public void eat(){
        System.out.println("Animal eating");
    }
}

//class OtherAnimal extends Animal{
//    public void eat(){
//        System.out.println("Other animal eating");
//    }
//}

public class Test {

    public static void main(String[] args) {

        Animal animal  = new Animal();
        animal.eat();

//        OtherAnimal otherAnimal = new OtherAnimal();
//        otherAnimal.eat();

//        ANONIM class
        Animal animal2 = new Animal() {
            public void eat(){
                System.out.println("New animal eat");
            }
        };
        animal2.eat();


        AbleToEat ableToEat = new AbleToEat() {
            @Override
            public void eat() {
                System.out.println("Override method eat in interface AbleToEat");
            }
        };

        ableToEat.eat();
    }
}
