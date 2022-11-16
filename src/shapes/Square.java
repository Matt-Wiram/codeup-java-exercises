package shapes;

public class Square extends Rectangle{
    private int side;
    private Rectangle square;

    public Square(int side){
        super(side, side);

    }
    public int getPerimiter(int side) {
        System.out.println("sfds");
        return side * 4;
    }
    public int getArea(int side) {
        System.out.println("dfsd");
        return side *  side;
    }
    public static void main(String[] args) {

    }
}
