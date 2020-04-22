package shapes;

public class Square {
    protected double side;

    public Square(double side){
        this.side = side;
    }
    public double getArea(){
        return Math.pow(this.side, 2);
    }
    public double getPerimeter(){
        return 4 * this.side;
    }
//MAIN
public static void main(String[] args) {

}
}
