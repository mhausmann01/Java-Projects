import java.util.Scanner;
class HWTriangle{
   public static void main(String[]args){
   Scanner userInput = new Scanner(System.in);
   
   double s1, s2, s3;
   String s;
   boolean f;
   
   System.out.println("Please enter the three sides of a triangle: ");
   s1 = userInput.nextDouble();
   s2 = userInput.nextDouble();
   s3 = userInput.nextDouble();
   System.out.println("Please indicate if the triangle is filled: ");
   f = userInput.nextBoolean();
   System.out.println("Please enter a color: ");
   String msg = userInput.nextLine();
   s = userInput.nextLine();
   
   Triangle t1 = new Triangle(s,f,s1,s2,s3);
   Triangle t2 = new Triangle(s1, s2, s3);
   
   System.out.println("The area is: " + t2.getArea() + " The perimeter is: " + t2.getPerimeter() + " Color? " + t1.color + " Filled? " + t1.filled);
   
   }
}

public class GeometricObject {

String color;
boolean filled;

GeometricObject(){
this("No color ", false);
}

GeometricObject(String color, boolean filled){
this.color = color;
this.filled = filled;
}


}

class Triangle extends GeometricObject {

double side1;
double side2;
double side3;

Triangle(){
this(1.0, 1.0, 1.0);
}

Triangle(double side1, double side2, double side3){
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}

Triangle(String color, boolean filled, double side1, double side2, double side3){
super(color, filled);
this.side1 = side1;
this.side2 = side2;
this.side3 = side3;
}

double getSide1(){
return side1;
}

double getSide2(){
return side2;
}

double getSide3(){
return side3;
}

public double getArea(){
double s;
double a;

s = (this.side1 + this.side2 + this.side3)/2;
a = Math.sqrt(s*((s-this.side1)*(s-this.side2)*(s-this.side3)));

return a;
}

public double getPerimeter(){
double p;

p = this.side1 + this.side2 + this.side3;

return p;
}

public String toString(){
return "Triangle: side1 = " + side1 + "side2 = " + side2 + "side3 = " + side3;
}

}