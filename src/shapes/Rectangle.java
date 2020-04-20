public class Rectangle{
    protected static int length( int length){
        return length;
    }
    protected static int width( int width){
        return width;
    }
    protected static double getArea(int lenght, int width) {
        return lenght * width;
    }
    protected static double getPerimiter(int length, int width){
            return 2*length + 2*width;
        

    }
//SQUARE CLASS
     class Square extends Rectangle{

}
//    MAIN
public static void main(String[] args) {
    System.out.println(length(4));
    System.out.println(width(4));
    System.out.println(getArea(length(4), width(4)));
    System.out.println(getPerimiter(length(5),width(10)));
}

}