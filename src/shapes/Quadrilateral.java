package shapes;

abstract class Quadrilateral extends  Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double aLenght, double aWidth){
        this.length = aLenght;
        this.width = aWidth;

    }
    public double getLength() {
        return this.length;
    }

    abstract void setLength(double aLength);

    public double getWidth() {
        return this.length;
    }

    abstract void setWidth(double aWidth);

}

}
