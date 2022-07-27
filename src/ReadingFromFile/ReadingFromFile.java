package ReadingFromFile;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class ReadingFromFile {
    public static void main(String[] args) throws FileNotFoundException {
//        in Linux path/path Windows path\path
        String separator = File.separator;

        String pathToFile =
                separator + "Users"
                +separator+"kirianov"
                +separator+"IdeaProjects"
                +separator+"untitled"
                +separator+"src"
                +separator+"ReadingFromFile"
                +separator+"Test.txt";

        String pathToSecondFile =
                separator + "Users"
                +separator+"kirianov"
                +separator+"IdeaProjects"
                +separator+"untitled"
                +separator+"src"
                +separator+"ReadingFromFile"
                +separator+"TestInt.txt";

        File file2 = new File(pathToSecondFile);
        File file = new File(pathToFile);

        Scanner scanner2 = new Scanner(file2);
        String line = scanner2.nextLine();
        String[] numbers = line.split(" ");

        int [] numbersArray = new int[3];
        int counter = 0;
        for(String number: numbers) {
            numbersArray[counter++] = Integer.parseInt(number);
        }
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(numbersArray));

        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }

//        after used scanner we should close scanner
        scanner.close();
        scanner2.close();
    }
}
