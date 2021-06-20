class Employee
{
   static String name;
	static int id;
	   
	   public Employee(String name, int id)
     {
	    this.name=name;
		this.id=id;
	 }
	 
	 public static void main(String args[])
	 {
	 Employee e1=new Employee("vijay",100);
	 System.out.println(id+" "+name);
        Employee e2=new Employee("Ajay",101);
        System.out.println(id+" "+name);
	 }
}