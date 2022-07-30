package Exeptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Exeptions1 {
    public static void main(String[] args) throws IOException {
        File file = new File("qwert");

        Scanner scanner = null;
        try {
            scanner = new Scanner(file);
        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
            System.out.println("LOH");
        }

        System.out.println("After block try catch always work when we used try catch code after will work");

        try {
//            because we don`t have throws FileNotFoundException in this method main
            readFile();
        } catch (FileNotFoundException e) {
            System.out.println("Dont work you file"+e);
        }

        Scanner scanner3 = new Scanner(System.in);
        while(true){
            int x =  Integer.parseInt(scanner3.nextLine());
            if(x!=0){
                throw new IOException();
            }
        }
    }
    public static void readFile() throws FileNotFoundException{
        File file2 = new File("qwert2");
        Scanner scanner2 = new Scanner(file2);
    };
}