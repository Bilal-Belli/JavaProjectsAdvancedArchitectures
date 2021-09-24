import java.util.Scanner;
import java.util.*;
abstract class Shape {
    int width;
    abstract void area();
}
//your code goes here
public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
    }
}
class Square extends Shape  {
    int width;
    Square(int width){
        this.width = width;
    }
    void area(){
        System.out.println(width*width);
    };
}
class Circle extends Shape {
    int width;
    Circle(int width){
        this.width = width;
    }
    void area(){
        System.out.println((Math.PI)*width*width);
    };
}
