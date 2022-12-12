package shapes;



public class Rectangle extends Quadrilateral implements Measureable {

    public Rectangle(int length, int width) {
        super(length, width);

    }

    @Override
    public double getPerimeter() {
        return (width * 2) + (length * 2);
    }

    @Override
    public double getArea() {
        return width * length;
    }

    @Override
    public void setLength(int length) {
        this.length = length;
    }

    @Override
    public void setWidth(int width) {
        this.width = width;
    }
}
//
//    private int width;
//
//    private int length;
//
//    public Rectangle(int width, int length) {
//        this.width = width;
//        this.length = length;
//    }
//
//    public int getArea(int width, int length) {
//        return length * width;
//    }
//
//    public int getPerimiter(int width, int length) {
//        return (2 * length) + (2 * width);
//    }
//
//    public int getWidth() {
//        return width;
//    }
//
//    public void setWidth(int width) {
//        this.width = width;
//    }
//
//    public int getLength() {
//        return length;
//    }
//
//    public void setLength(int length) {
//        this.length = length;
//    }
//
//    public static void main(String[] args) {
//
//    }

