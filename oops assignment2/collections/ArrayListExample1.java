import java.util.*;
class ArrayListExample1
{
   public static void main(String args[])
   {
   ArrayList<String>list1=new ArrayList<String>();
   list1.add("mango");
   list1.add("banana");
   list1.add("apple");
   list1.add("jackfruit");
   for(String x:list1){
System.out.println(x);
   }
     Collections.sort(list1);
   System.out.println("after sorting...........");

   for(String x:list1){
System.out.println(x);
   }

ArrayList<String>list2=(ArrayList<String>)list1.clone();
list2.add("sid");
 System.out.println(list2);
}
}
