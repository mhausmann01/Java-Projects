import java.util.Scanner;
import java.io.*;


public class ReadWrite {
public static void main(String[]args) throws java.io.IOException{

java.io.File file = new java.io.File("Exercise12_15.txt");
PrintWriter output = new PrintWriter(file);

int a[] = new int[100];
for(int b = 0; b < 100; b++){
      a[b] = (int) (Math.random() * 100);
      
      output.print(a);
      }
      
      System.out.println();
      
      output.close();

}  
}
