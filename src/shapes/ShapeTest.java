package shapes;

abstract class ShapesTest {

    public static void main(String[] args) {

        Measurable myShape;

        myShape = new Square(5);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());

        myShape = new Rectangle(4, 6);
        System.out.println("myShape.getArea() = " + myShape.getArea());
        System.out.println("myShape.getPerimeter() = " + myShape.getPerimeter());


//        Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("box1.getPerimeter() = " + box1.getPerimeter());
//        System.out.println("box1.getArea() = " + box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println("box2.getPerimeter() = " + box2.getPerimeter());
//        System.out.println("box2.getArea() = " + box2.getArea());

    }

}