

import java.util.*;

 class Student1

{

   Scanner sc=new Scanner(System.in);

   int RegNo,Total=0,subjects;

   String name;

   int marks[];

   void Student()

   {

      System.out.print("Enter Registration No.: ");

      RegNo=sc.nextInt();

      System.out.print("Enter Student Name: ");

      name=sc.next();;

      getDisMarks();

   }

   public void getDisMarks()

   {

       marks=new int[3];

       System.out.print("Enter marks of Physics: ");

       marks[0]=sc.nextInt();

       System.out.print("Enter marks of Chemistry: ");

       marks[1]=sc.nextInt();

       System.out.print("Enter marks of Maths: ");

       marks[2]=sc.nextInt();

       for(int i=0;i<3;i++)

       {

          Total+=marks[i];

       }

       System.out.println("Total Marks of student "+name+": " +Total);

   }

}

class StudentDemo

{

    public static void main(String args[])

    {

        Student1 s[]=new Student1[5];

        for(int i=0;i<5;i++)

              s[i]=new Student1();

     }

}