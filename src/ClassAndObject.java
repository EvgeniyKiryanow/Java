public class ClassAndObject {
    public static void main(String[] args) {
    Person personOne = new Person();
        personOne.setName("");
        personOne.setAge(18);
        System.out.println(personOne.getName());
        System.out.println(personOne.getAge());
        personOne.speak();
    }
}
class Person {
// Classes can have => 1)data 2)behaviors (methods)
    private String name;
    private int age;

//    Getter and Setter
    public void setName(String userName) {
        if(userName.isEmpty()){
            System.out.println("Empty name bro set your name");
            name = "";
        } else {
            name  = userName;
        }
    }

    public String getName(){
        return name;
    }

    public void setAge(int userAge) {
        if(userAge<0) {
            System.out.println("Inccorect age");
            age = 0;
        }else {
            age  = userAge;
        }
    }

    public int getAge(){
        return age;
    }

    //Types return from methods => void(empty type) it will return nothing if we want to return String or num we should
    //name start with int double string ets...

    int calculateYears() {
        int years = 65-age;
        System.out.println(years);
        return years;
    }
    void speak(){
        System.out.println("My name is "+name+" and I am "+age+" years old");
    }

    void sayHello(){
        System.out.println("Hello loh");
    }
}

