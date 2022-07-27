public class This {
    public static void main(String[] args) {
        Human h1 = new Human("Pepper",12);
        Human h2 = new Human("Bodya",42);
        Human.printNumberOfPeople();
    }
}
class Human {
    private String name;
    private int age;
    public static int countPeople;
//    Constructor decare on default to each class if we want to use it we should write publick [ClassName](){};
//    public Human(){
//        this("Repper",12);
//    }
//
//    public Human(String name) {
//        System.out.println("Hello from second constructor");
//        this.name = name;
//    }

    public Human(String name, int age) {
        System.out.println("Hello from third constructor");
        this.name = name;
        this.age = age;
        countPeople ++;
    }

    public void setName(String name) {this.name = name;}
    public void setAge(int age) {this.age = age;}
    public String getName(){return name;}
    public int getAge(){return age;}
    void getInfo(){System.out.println("My name is "+name+" and I am "+age+" years old");}
    public static void printNumberOfPeople(){
        System.out.println("numbers of people "+countPeople);
    }
}
