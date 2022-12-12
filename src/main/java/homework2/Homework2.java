package homework2;

import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args){

        String inputName = " Your name is <My name>";
        Scanner scan = new Scanner(System.in);
        String outputName = scan.nextLine();
        System.out.println(inputName.replace("<My name>", outputName));

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name"); //Milena
        String firstName = scanner.nextLine();

        System.out.println("Enter your username"); //milena
        String userName = scanner.nextLine();

        System.out.println(firstName.equalsIgnoreCase(userName)); // output is true
    }


}
