package main;

//import java.time.LocalDate;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


//        METHODS
        char[] letters = {'A','A','B','C','D','D','D'};
        int count = countLetters(letters, 'A');
        System.out.println(count);

        int [][] arrays = {{1,2,3},{4,5,6,}};
//SCANNER class
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Your name?");
//        String userName = scanner.nextLine();
//        System.out.println("Your name is: " +userName);
//        System.out.println("How old are you?");
//        int age = scanner.nextInt();
//        int year = LocalDate.now().minusYears(age).getYear();
//        System.out.println("You was born in : "+year+"year");


////        Do while loop
//        int x = 1;
//
//        do{
//            System.out.println(x);
//            x++;
//        }while(x<20);
//

//        While loop
//        int x = 1;
//        while(x<20){
//            System.out.println(x);
//            x++;
//        }

//Loop
//        int [] numbers = {2,3,4,5,6,7,8,9};
//        for(int i = 1; i<numbers.length;i++){
////            here we have access to index
//            System.out.println(numbers[i]);
//
//        }
//        System.out.println("another one");
//        for(int number:numbers) {
//            //            here we don't have access to index
//            System.out.println(number);
//        }

//        we can create for statement with less code example = numbers.for[and find in IDE which we wont to create]
////Arrays
//        int a = 1;
//        int b = 2;
////        new int[[numbers]] => we must to declare how many items will be in array same as boolean string etc...
//        int [] numbersArr = new int[2];
//        boolean [] booleanArr = new boolean[3];
//        System.out.println(Arrays.toString(numbersArr));
//        System.out.println(Arrays.toString(booleanArr));
//
//        //If we dont wont to declare size of array we should use
//        int [] numbersArrWithoutSize = {1,2,3};
//        System.out.println(Arrays.toString(numbersArrWithoutSize));
//
//        //take last index of array
//        int lastIndex = numbersArrWithoutSize[numbersArrWithoutSize.length - 1];
//        System.out.println(lastIndex);

// Imports
//        We can import our packaged in two ways fist import class example import java.util.Date or use it like=>java.util.Date date2 = new java.util.Date();
//            Date date = new Date();
//            java.util.Date date2 = new java.util.Date();
//            java.time.LocalDate localDate = java.time.LocalDate.now();
//            LocalDateTime localDateTime = LocalDateTime.now();



//        No primitive exactly reference data types examples
//        Reference types always start with Uppercase and than we can do ... name.[options]

//        String name = new String("Name");
//        Date date = new Date();
//        LocalDate now = LocalDate.now();
//        System.out.println(now);
//        System.out.println(date);
//        System.out.println(name.toUpperCase());

//        Change between reference and primitive data type Reference like => link
//        Person alex = new Person("alex");
//        Person mari = alex;
//
//        System.out.println("before changing alex name");
//        System.out.println("alex name " + alex.name + " mari name " +mari.name);
//        alex.name = "New alex name";
//        System.out.println("after changing alex name");
//        System.out.println("alex name " + alex.name + " mari name " +mari.name);
    }
    //int because we will return integer(number)=>examples double String char etc...
    public static int countLetters(char [] letters, char searchLetter) {
        int count = 0;
        for (char letter:letters) {
            if(letter == searchLetter) {
                count++;
            }
        }
        return count;
    }

    static class Person {
        String name;

        Person(String name) {
            this.name = name;
        }
    }
}