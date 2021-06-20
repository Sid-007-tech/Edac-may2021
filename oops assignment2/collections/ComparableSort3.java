import java.util.*;
class Student implements Comparable<Student>
{
   int age;
   int rollno;
   String name;
    Student(int age,int rollno,String name)
	{
	     this.name=name;
		 this.rollno=rollno;
		 this.age=age;
	}
	
public int compareTo(Student st)
{
    if(rollno==st.rollno)
       {return 0;}
    else if (rollno<st.rollno)
		{return -1;}
     else
          return 1;	 
}
}
public class ComparableSort3
{
   public static void main(String args[])
   {
      ArrayList <Student> st=new ArrayList<Student>();
	  st.add(new Student(23,108,"amit"));
	  st.add(new Student(21,103,"vishakha"));
	  st.add(new Student(25,109,"raj"));
   
   
   
   Collections.sort(st);
   for(Student s : st)
   {
       System.out.println(s.age+"  "+s.rollno+"  "+s.name);
   }
}  }  