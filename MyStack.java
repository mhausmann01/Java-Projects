import java.util.ArrayList;
import java.util.Scanner;

class TestStack {
public static void main(String[]args){
Scanner userInput = new Scanner(System.in);

String s1 , s2, s3, s4, s5;

System.out.println("Please enter string 1: ");
   s1 = userInput.nextLine();
System.out.println("Please enter string 2: ");
   s2 = userInput.nextLine();
System.out.println("Please enter string 3: ");
   s3 = userInput.nextLine();
System.out.println("Please enter string 4: ");
   s4 = userInput.nextLine();
System.out.println("Please enter string 5: ");
   s5 = userInput.nextLine();
   
NewStack stack = new NewStack();

stack.push(s1);
stack.push(s2);
stack.push(s3);
stack.push(s4);
stack.push(s5);

for (int i = stack.size() - 1; i >= 0; i--){
System.out.print(stack.get(i) + " ");
}
System.out.println();
 
}
}

public class MyStack {
private ArrayList<Object> list = new ArrayList<>();

public boolean isEmpty() {
return list.isEmpty();
}

public int getSize(){
return list.size();
}

public Object peek(){
return list.get(getSize() - 1);
}

public Object pop(){
Object o = list.get(getSize() - 1);
list.remove(getSize() - 1);

return o;
}

public void push (Object o) {
list.add(o);
}

@Override
public String toString(){
return "Stack: " + list.toString();
}
}

class NewStack extends ArrayList<Object> {

NewStack(){

}

public boolean isEmpty() {
return this.isEmpty();
}

public int getSize(){
return this.size();
}

public Object peek(){
return this.get(getSize() - 1);
}

public Object pop(){
Object o = this.get(getSize() - 1);
this.remove(getSize() - 1);

return o;
}

public void push (Object o) {
this.add(o);
}

@Override
public String toString(){
return "Stack: " + this.toString();
}


}