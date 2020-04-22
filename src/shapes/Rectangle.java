package shapes;

public class Rectangle extends Quadrilateral implements Measurable{
    public Rectangle(double aLength, double aWidth){
        super(aLength, aWidth);
    }

    @Override
    void setLength(double aLength) {

    }

    @Override
    void setWidth(double aWidth) {

    }

    //    protected double length;
//    protected double width;
//
//    public  Rectangle(double length, double width){
//        this.length = length;
//        this.width = width;
//    }
//    public double getArea() {
//        return this.length * this.width;
//    }
//    public double getPerimiter(){
//        return  this.length * this.width;
//    }
//    MAIN
public static void main(String[] args) {

}

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
