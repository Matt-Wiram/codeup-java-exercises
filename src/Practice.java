public class Practice {
    String monsterName;
    int monsterHP;
    int monsterAtt;

    int playerDamage;

    boolean monsterDeath;

    public static int rando(int att) {
        return (int) Math.floor(Math.random() * att);
    }

    public Practice(String name, int hp, int att) {
        monsterName = name;
        monsterHP = hp;
        monsterAtt = rando(att);

    }
    public static int remaingHP(int hp, int damage) {
        return hp - damage;
    }

    public static String deathCheck(int hp) {

        boolean check =  (hp <= 0) ? true : false;
        if (check == true) {
            return "The creature is dead";
        } else return "The monster has " + hp + " HP left";
    }

    public static void main(String[] args) {
        Practice rabbit = new Practice("Horned Rabbit", 10, 4);
        System.out.println(rabbit.monsterAtt);
        System.out.println(rabbit.monsterHP);
        System.out.println(deathCheck(remaingHP(rabbit.monsterHP, 6)));

    }

}
