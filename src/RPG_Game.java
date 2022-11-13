import java.util.Scanner;

public class RPG_Game {
    public static class Player {
        int att = 5;
        int def = 5;
        int cultivation = 0;
        int hp = 10;
        String weapon;
    }


public static String gameStart() {
    String name;
    boolean bool = false;
    while (bool == false) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Hello, are you a cultivator welcome to our chat group? [Y/N]: ");
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


public static int damage(int damage, int hp) {
    return hp - damage;
}

public static int cultivationInc(int exp, int cultivation) {
    return exp + cultivation;
}

    public static void main(String[] args) {
       String Playername =  gameStart();
       Player player = new Player();

       dormRoom(player.cultivation, player.weapon, player.hp, player.def, player.att, Playername);

    }

    public static void dormRoom(int cultivation, String weapon, int hp, int def, int att, String name) {
        System.out.println("You are in your dorm room and recieve an invite to a chat group, The Cultivation Chat Group. You recieve a cultivation technique and read it");
        cultivation = cultivationInc(5, cultivation);
        System.out.println("Your cultivation has increased by 5 you are now in Qi condensing stage and your cultivation is " + cultivation + " A little more qi and you will break through the Foundation Establishment Realm");
        System.out.println("You see three weapons suddenly float in front of you through the window a sword, a staff, and a book. Which one do you choose? [1: Sword 2: Staff 3: Book]");
        Scanner scanner = new Scanner(System.in);
        String sword = "Sword";
        String staff = "Staff";
        String book = "Book";

        int choice = scanner.nextInt();
        if (choice == 1) {
            weapon = sword;
        } else if (choice == 2) {
            weapon = staff;
        } else if (choice == 3) {
            weapon = book;
        }
        System.out.println("You have chosen the " + weapon + " as your cultivation weapon. These are your stats");
        System.out.println("Name: " + name);
        System.out.println("Attack: " + att);
        System.out.println("Defense: " + def);
        System.out.println("Cultivation: " + cultivation);
        System.out.println("Health Points " + hp);
        System.out.println("Weapon: " + weapon);
        System.out.println("You are given a choice of three locations to train [1: Desert 2: Island 3: Forest]");
        int locale = scanner.nextInt();
        if (locale == 1) {
            desert(weapon, name, att, def, cultivation, hp);
        }
//        else if (locale == 2) {
//            island(weapon, name, att, def, cultivation, hp);
//        } else if (locale == 3) {
//            forest(weapon, name, att, def, cultivation, hp);
//        }
    }

    public static void desert(String weapon, String name, int att, int def, int cultivation, int hp) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("You arrive at the Desert of Africa and see a monster the horned rabbit do you attack or look around?[1: Attack 2: Look Around]");
        int choice = scanner.nextInt();
        if (choice == 1 && weapon.equalsIgnoreCase("sword")) {
            System.out.println("You slash at the rabbit before it even sees you");
        }
    }

}
