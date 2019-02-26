public class HWMyRectangle2D{
   public static void main(String[] args){
   
      MyRectangle2D r1;
      
      r1 = (new MyRectangle2D(4, 5, 10.5, 3.2));
      
      r1.getArea();
      r1.getPerimeter();
      r1.contains(3, 3);
      
      r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2));
      r1.contains(new MyRectangle2D(3, 5, 2.3, 5.4));
   }
}