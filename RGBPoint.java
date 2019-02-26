class TestRGBPoint {
   public static void main(String[] args){
      
      RGBPoint firstPoint;
      
      firstPoint = new RGBPoint(1.0, 1.0, 44, 44, 44);
      System.out.println("Before 1st merging: ");
      firstPoint.display();
      
      firstPoint.mergeColors(40, 44, 44);
      System.out.println("After 1st merging: ");
      firstPoint.display();
      
      firstPoint.mergeColors(new RGBPoint(14, 14, 14));
      System.out.println("After 2nd merging: ");
      firstPoint.display();
      
      
      
      firstPoint.distance(new RGBPoint(4.0, 4.0));
      firstPoint.display();
      
   }

}



public class RGBPoint {

   private double x;
   private double y;
   private int r;
   private int b;
   private int g;
   
   RGBPoint(double x, double y, int r, int b, int g){
      this.x = x;
      this.y = y;
      this.r = r;
      this.b = b;
      this.g = g;
   }
   
   RGBPoint(double x, double y){
      this.x = x;
      this.y = y;
      this.r = 255;
      this.b = 255;
      this.g = 255;
   }
   
   RGBPoint(int r, int b, int g){
      this.x = 0.0;
      this.y = 0.0;
      this.r = r;
      this.b = b;
      this.g = g;
   }
   
   RGBPoint(){
      this(0.0, 0.0, 255, 255, 255);
      }
      
   public void mergeColors(int r, int g, int b){
      this.r = Math.abs(this.r - r);
      this.g = Math.abs(this.g - g);
      this.b = Math.abs(this.b - b);
   }
   
   public void mergeColors(RGBPoint other){
      r = Math.abs(this.r - other.r);
      g = Math.abs(this.g - other.g);
      b = Math.abs(this.b - other.b);
   }
   
   public void display(){
      System.out.println(r + ", " + g + ", " + b);
   }
   
   public double distance(RGBPoint other){
      double a = other.x - this.x;
      double b = other.y - this.y;
      double d = Math.sqrt(a*a + b*b);
      
      System.out.println(d);
      return d;
   }   
   
}