import java.util.Scanner;
import java.io.*;


public class CountFile {
public static void main(String[]args) throws Exception{

java.io.File file = new java.io.File("Shakespeare.txt");

int counterLine = 0;
int counterWord = 0;

try(Scanner s = new Scanner (file)){

while(s.hasNextLine()){
String line = s.nextLine();
counterLine++;

}

System.out.println(counterLine);

}catch(IOException exception){

System.out.println(exception);

}

try(Scanner s = new Scanner (file)){

while(s.hasNext()){
String Word = s.next();
counterWord++;

}

System.out.println(counterWord);

}catch(IOException exception){

System.out.println(exception);

}


}
}