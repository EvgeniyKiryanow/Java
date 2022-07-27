import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
//        before 5 Java
        List animals = new ArrayList();
        animals.add("cat");
        animals.add("dog");
        animals.add("frog");

        String animal = (String) animals.get(1);
        System.out.println(animal);

//        after created Generic
        List<String> animal2 = new ArrayList<String>();
        animal2.add("cat");
        animal2.add("dog");
        animal2.add("frog");

        String animals2 = animal2.get(1);
        System.out.println(animals2);

//      after  Java 7
        List<String> animal3 = new ArrayList();
        animal3.add("cat");
        animal3.add("dog");
        animal3.add("frog");
        System.out.println(animal3);
    }
}
