package abstraction;

public class abstract2 extends abstraction1
{
     int empid=123;
     String empname="Raju";
     long empno=89564712;
     
     public void empdetails()
     {
    	 System.out.println("Employee id: " +empid);
    	 System.out.println("Employee Name: " +empname);
    	 System.out.println("Employee Number: " +empno);
     }
     
	public static void main(String[] args)
	{
		abstract2 ob=new abstract2();
		ob.empdetails();

	}

}
