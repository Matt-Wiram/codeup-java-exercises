package shapes;

import org.w3c.dom.css.Rect;

public class ShapesTest {





    public static void main(String[] args) {
//         Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimiter(box1.getWidth(), box1.getLength()));
//        System.out.println(box1.getArea(box1.getWidth(), box1.getLength()));
//        Square box2 = new Square(5);
//        System.out.println(box2.getPerimiter(box2.getSide()));
//        System.out.println(box2.getArea(box2.getSide()));
        Measureable myShape = new Rectangle(2, 4);
        Measureable myShape2 = new Square(4);
        Measureable myshape3 = new Square( 5);
        System.out.println(myShape2.getPerimeter());
        System.out.println(myShape2.getArea());
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        System.out.println(myshape3.getPerimeter());
        System.out.println(myshape3.getArea());
    }
}


//    create a variable of the type Rectangle named box2 and assign it a new instance of the Square class that has a side value of 5.
//        verify that the getPerimeter and getArea methods return 20 and 25, respectively.