package AbstractClasses;

public class Dog extends Animal implements AbleToMakeSound {

    @Override
    public void makeSound() {
        System.out.println("gav");
    }

    @Override
    public void goHome() {
        System.out.println("I go home");
    }
}
