import util.Input;

public class InputTest {
    public static void main(String[] args) {
        Input input = new Input();
        input.yesNo();
        input.getInt(1, 10);
        input.getInt();
        input.getDouble(1.0, 10.0);
        input.getDouble();
    }
}
