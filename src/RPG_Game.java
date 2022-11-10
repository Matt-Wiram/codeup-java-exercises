import java.util.Scanner;

public class RPG_Game {



public static String gameStart() {
    String name;
    boolean bool = false;
    while (bool == false) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Welcome brave adventurer would you like to start your adventure? [Y/N]: ");
    String start = scanner.next();
    if (start.equalsIgnoreCase("y")) {
        bool = true;
    } else bool = false;
}

    Scanner scanner = new Scanner(System.in);
    System.out.println("What is your name?");
    name = scanner.nextLine();
    return name;
}

public class Player {

}






    public static void main(String[] args) {
       String name =  gameStart();

    }

}
