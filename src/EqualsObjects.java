public class EqualsObjects {
    public static void main(String[] args) {
        /*references data types
            animal1  =>  {1}
            animal2  =>  {1}
            animal1 == animal2 => false
        */


        int x = 1;
        int y = 2;
        System.out.println(x == y);
        People people1 = new People(1);
        People people2 = new People(1);
        System.out.println(people1 == people2);

        System.out.println(people1.equals(people2));

        /*

            String a => {a}
            String b => {a} =>  String a => {a}  String Pool;
         */

        String a = "a";
        String b  = "a";

        System.out.println(a == b);
        System.out.println(a.equals(b));

        //if we create two string with String var = new String("var") == and equals doesnt work because we created new objects

    }
}

class People {
    private int id;

    public People(int id){
        this.id = id;
    }

    public boolean equals(Object obj){
        People otherPeople = (People) obj;
        return this.id == otherPeople.id;
    }
}
