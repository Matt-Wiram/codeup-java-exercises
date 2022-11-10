import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately %.2f%n", pi);
//
//
////        Scanner scanner = new Scanner(System.in);
//        Scanner strscanner = new Scanner(System.in);
//
////        System.out.print("Enter an integer: \n");
//        System.out.print("Enter three words: ");
//
////        int nextInt = Integer.parseInt(scanner.next());
//        String myString = strscanner.nextLine();
//
////        System.out.println("You entered: --> \"" + nextInt + "\" <--");
//        System.out.println("You entered: --> \"" + myString + "\" <--");

        Scanner scanner = new Scanner(System.in).useDelimiter(".[0-9]");

        System.out.print("Enter the length of your room: ");
        int nextString = scanner.nextInt();

        System.out.println(nextString);
        scanner.nextLine();
        System.out.print("Enter the width of your room: ");

        int nextNString = scanner.nextInt();

        float total = ((nextString + nextNString) * 2);
        float area = (nextString * nextNString);
        area *= area;
        System.out.println("This is the perimeter " + total);
        System.out.println("This is the area " + area);
    }
}
