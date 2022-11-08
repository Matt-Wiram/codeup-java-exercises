import java.util.Scanner;

import static java.lang.Integer.parseInt;

public class ConsoleExercises {
    public static void main(String[] args) {
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately %.2f%n", pi);
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

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length and width of your room: ");
        float nextString = scanner.nextFloat();
        float nextNString = scanner.nextFloat();
        float total = ((nextString + nextNString) * 2);
        System.out.println("This is the area " + total);
    }
}
