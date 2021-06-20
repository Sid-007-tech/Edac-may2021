import java.util.*;
class TestSort1
{
	public static void main(String args[])
	{
		
	ArrayList <String>al = new ArrayList<>();
	al.add("me");
	al.add("ti");
	al.add("ani");
	al.add("barach");
	 
	Collections.sort(al);
     
		Iterator itr= al.iterator();
		while(itr.hasNext())
		{
		 System.out.println(itr.next());
		}
	System.out.println(al);
	ArrayList <Integer>al2 = new ArrayList<>();
	al2.add(4);
	al2.add(1);
	al2.add(3);
	al2.add(9);
	al2.add(2);
	
	Collections.sort(al2,Collections.reverseOrder());
	System.out.println(al2);
	}
	

}