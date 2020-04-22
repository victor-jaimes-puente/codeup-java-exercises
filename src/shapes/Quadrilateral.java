package shapes;

abstract class Quadrilateral extends  Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double aLenght, double aWidth){
        this.length = aLenght;
        this.width = aWidth;

    }


}
