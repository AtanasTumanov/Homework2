package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){

        // task 1

        String inputName = " Your name is <My name>";

        Scanner scan = new Scanner(System.in);
        String outputName = scan.nextLine();

        System.out.println(inputName.replace("<My name>", outputName));

        // task 2

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String firstName = scanner.nextLine();

        System.out.println("Enter your username");
        String userName = scanner.nextLine();

        System.out.println(firstName.equalsIgnoreCase(userName));

        // task 3

        String cars = "I like BMW";
        int count = cars.split("\\s").length;
        System.out.println(count); // count is 3

        // task 4

        String color = "Red";
        String car = "Ferrari";
        System.out.println(color + " " + car);

    }
}
