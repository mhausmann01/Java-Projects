import java.util.ArrayList;

public class MyStack2{

   ArrayList<Object> list = new ArrayList<>();
   
   public Object clone() {
      // MAIN
      // MyStack2 obj = new MyStack2();
      // MyStack2 clone = obj.clone();
      MyStack2 myclone = new MyStack2();
      myclone.list = (ArrayList)list.clone();
      return myclone;
      /*
      ArrayList copyList = (ArrayList) list.clone();
      copyList.isEmpty();
      return copyList;
      */
   }
   
   public boolean isEmpty(){
      return list.isEmpty();
   }

   public int getSize() {
      return list.size();
   }

   public Object peek() {
      return list.get(getSize() -1);
   }

   public Object pop() {
      Object o = list.remove(getSize() - 1);
      return o;
   }



   public void push(Object o) {
      list.add(o);
   }

   @Override
   public String toString() {
      return "Stack: " + list.toString();
   }

//houseClone.whenBuilt = newjava.util.Date();
//houseClone.getWhenBuilt().setTime(whenBuilt.getTime());

}