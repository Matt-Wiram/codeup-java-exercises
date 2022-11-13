package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);
    private String getString() {

        return scanner.nextLine();
    }

    private boolean yesNo() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextBoolean();
    }




//    String getString();
//    boolean yesNo();
//    int getInt(int min, int max);
//    int getInt();
//    double getDouble(double min, double max);
//    double getDouble();





    public static void main(String[] args) {
        System.out.println("whats a string?: ");
        Input input = new Input();
        System.out.println(input.getString());

    }


}
