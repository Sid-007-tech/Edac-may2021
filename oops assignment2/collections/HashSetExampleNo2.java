import java.util.*;
class HashSetExampleNo2
{
  public static void main(String args[])
  {
  HashSet <String> set1= new HashSet<String>();
  set1.add("amit");
  set1.add("radhe");
  set1.add("shreya");
  set1.add("asawari");
  set1.add("kiran");
  set1.add("mahesh");
  System.out.println(set1);
  set1.remove("mahesh");
  System.out.println("after invoking remove"+set1);
   
   
   HashSet <String> set2= new HashSet<String>();
   set2.add("Anjali");
   set2.add("Anjali");
   System.out.println("adding to new list"+set2);
   set2.addAll(set1);
   System.out.println("updated list"+set2);
   //set2.removeAll(set1);
    //System.out.println("updated list"+set2);
	set2.removeIf(str->str.contains("Anjali"));
	 System.out.println("updated list"+set2);
	 set2.clear();
	 System.out.println("updated list"+set2);
	 
	 
  }



}