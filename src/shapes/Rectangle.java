package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    public Rectangle(double aLength, double aWidth) {
        super(aLength, aWidth);

        super.length = aLength;
    }

    public void setLength(double aLength) {
    }

    public void setWidth(double someWidth) {
        super.width = someWidth;
    }

    public double getPerimeter() {
        return (super.length * 2) + (super.width * 2);
    }

    public double getArea() {
        return (super.length * 2) + (super.width * 2);
    }

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
