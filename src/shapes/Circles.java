package shapes;

public class Circles {

    private double radius;

    public Circles(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        System.out.println(Math.PI * (Math.pow(this.radius, 2)));
        return Math.PI * (Math.pow(this.radius, 2));
    }
    public double getCircumference() {
        System.out.println(2 * Math.PI * this.radius);
        return 2 * Math.PI * this.radius;
    }


    public static void main(String[] args) {
        Circles circles = new Circles(4.0);
        circles.getArea();
        circles.getCircumference();
    }
}
