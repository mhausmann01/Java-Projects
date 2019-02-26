public class HWCircle2D {
   public static void main(String[] args){
   
      Circle2D c1;
      
      c1 = new Circle2D(2, 2, 5.5);
      
      c1.getArea();
      c1.getPerimeter();
      System.out.println(c1.contains(3, 3));
      System.out.println(c1.contains(new Circle2D(4, 5, 10.5)));
      System.out.println(c1.overlaps(new Circle2D(3, 5, 2.3)));
   
   }
}

public class Circle2D {
   double x;
   double y;
   double radius;


   double getX() {
      return x;
   }
   
   double getY() {
      return y;
   }
   
   double getRadius() {
      return radius;
   }
   
   Circle2D(){
      this(0.0, 0.0, 1.0);
     
   }
   
   Circle2D(double x, double y, double radius){
      this.x = x;
      this.y = y;
      this.radius = radius;
   }
   
   public double getArea(){
      double area;
      
      area = Math.PI * Math.pow(this.radius, 2);
      System.out.println("The area of the circle is "+area);
      
      return area;
   }
   
   public double getPerimeter(){
      double perimeter;
      
      perimeter = (2 * this.radius) * Math.PI;
      System.out.println("The perimeter of the circle is "+perimeter);
      
      return perimeter;
   }
   
   public boolean contains(double x, double y){
      double a = y - this.y;
      double b = x - this.x;
      double c = Math.sqrt(a*a + b*b);
      
      if(c < this.radius){
      return true;
      }else{
      return false;
      }
   }
   
   public boolean contains(Circle2D circle){
      double a = circle.x - this.x;
      double b = circle.y - this.y;
      double d = Math.sqrt(a*a + b*b);
      
      if (circle.radius - this.radius > d){
      return true;
      }else{
      return false;
      }
   }
   
   public boolean overlaps(Circle2D circle){
      double a = circle.x - this.x;
      double b = circle.y - this.y;
      double d = Math.sqrt(a*a + b*b);
      
      if (circle.radius - this.radius < d && d < circle.radius + this.radius){
      return true;
      }else{
      return false;
      } 
   }

}