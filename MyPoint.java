    public class MyPoint{
   private double x;
   private double y;
   
   double getX() {
      return x;
   }
   
   double getY() {
      return y;
   }
   
   MyPoint(){
      this.x = 0.0;
      this.y = 0.0;
   }
   
   MyPoint(double x, double y){
      this.x = x;
      this.y = y;
   }
   
   public double distance(MyPoint o){
      return MyPoint.distance(this.x, this.y, o.x, o.y);
   
   }
   
   public double distance(double x, double y){
      return MyPoint.distance(this.x, this.y,x,y);
   }

   public static double distance(double x1, double y1, double x2, double y2){
      double a;
      double b;
      double c;
      a = x2 - x1;
      b = y2- y1;
      c = Math.sqrt(a*a + b*b);
      
      System.out.println(c);
      return c;
   }
   
}