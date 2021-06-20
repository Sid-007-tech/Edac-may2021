import java.util.*;
class TreeMap1{
  public static void main(String args[])
  {
    TreeMap<Integer,String> tr= new TreeMap<>();
	tr.put(100,"amar");
	tr.put(107,"bhavana");
	tr.put(103,"bhavesh");
	tr.put(101,"sundar");
	tr.put(104,"amar");
	tr.put(100,"amar");
	
	for(Map.Entry m:tr.entrySet())
	{
	   System.out.println(m.getKey()+" "+m.getValue());
	}
	//tr.remove(107);
	System.out.println(tr);
	System.out.println("headMap"+tr.headMap(102));
	System.out.println("tailMap"+tr.tailMap(102));
	 System.out.println("subMap: "+tr.subMap(100, 102));    
  }
}
//df
//df