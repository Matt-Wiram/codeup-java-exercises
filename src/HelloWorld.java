import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int myFavoriteNumber = 7;
        String myString = "The wind is unfavorable for all with no destination.";
        System.out.println(myString);
        System.out.print("Hello ");
        System.out.print("World \n");
//        long myNumber = 3.14;
        double myNumber = 3.14;
        System.out.println(myNumber);
//        int x = 5;
//        System.out.println(++x);
//        System.out.println(x);

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o;

//        int x = 4;
//        x += 5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
//        y *= x;
//        System.out.println(y);

        int x = 10;
        int y = 2;
        x /= y;
        y -= x;
        System.out.println(x);
        System.out.println(y);


        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();

        System.out.println("You entered: --> \"" + userInput + "\" <--");
    }


}
