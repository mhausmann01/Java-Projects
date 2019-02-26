import java.util.Scanner;

public class IllegalArgs{
   public static void main(String[]args){
   
      Scanner userInput = new Scanner(System.in);
      Scanner s = new Scanner(System.in);
      
      int a[] = new int[100];
      
      for(int b = 0; b < 100; b++){
      a[b] = (int) (Math.random() * 100);
      }
      
      try{
      System.out.println("Please enter the index of the number you want to see: ");
      int x = userInput.nextInt();
      
      System.out.println(a[x]);
      }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Out of Bounds");
      }
}
}