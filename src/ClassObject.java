public class ClassObject {
    public static void main(String[] args) {
        Human2 h1 = new Human2("Dodick",20);
        System.out.println(h1);
        // h1 => Human2@372f7a8d
    }
}

class Human2 {
    private String name;
    private int age;

    public Human2(String name,int age) {
        this.name  = name;
        this.age = age;
    }

    public String toString(){
        return name+","+age;
    }
}