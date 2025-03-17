import java.util.*;
class personalinfo
{
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the student details like rollno,name,prn,fee");
	int rollno=sc.nextInt();
	String name=sc.next();
	int prn=sc.nextInt();                                                           
	float fee=sc.nextFloat();
	System.out.println("Student rollno"+rollno);
	System.out.println("Student name"+name);
	System.out.println("Student prn"+prn);
	System.out.println("Student fee"+fee);
	}
}


