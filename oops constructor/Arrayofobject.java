public class Arrayofobject{
     public static void main(String args[]){
	 
	 Student s1=new Student("akash",101);
	 Student s2=new Student("ankita",102);
	 Student s3 = new Student("Aditya",103);
	 }
}
  class Student{
     String name;
	 int id;
	 
	 public Student(String name,int id){
	 this.name=name;
	 this.id=id;
	 }
     
	 void display(){
	 System.out.println("student name is"+name+" student id is"+id);
	 }
  }