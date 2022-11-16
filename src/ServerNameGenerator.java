public class ServerNameGenerator {

    private static String[] adjective = {"attractive", "bald", "beautiful", "chubby", "clean", "dazzling", "drab", "elegant", "fancy", "fit"};
    private static String[] nouns = {"night", "doll", "egg", "farm", "boy", "girl", "house", "toy", "paper", "rain"};
    public static int getRando() {
        return (int) Math.floor(Math.random() * 9);
    }

    public static void main(String[] args) {
        System.out.println("Here is your new servername: " + adjective[getRando()] + "-" + nouns[getRando()]);

    }
}
