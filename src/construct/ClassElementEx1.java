package construct;


import java.awt.*;

public class ClassElementEx1{
    public static void main(String[] args) {
        Rectangle rect =new Rectangle(5,8);

        System.out.println("넓이: "+rect.calcularArea());
        System.out.println("높이: "+rect.calculatePerimeter());
        System.out.println("정사각형 여부: "+rect.isSquare());

    }

}
class Rectangle {

    private int width ;
    private int height ;
    public Rectangle(int width,int height){
        this.width = width;
        this.height =height;
    }

    public int calcularArea(){
        return width+ height;
    }
    public  int calculatePerimeter(){
        return 2 * (width+ height);
    }
    public  boolean isSquare(){
        return this.width == this.height;
    }
}

