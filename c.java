import java.util.*;
class A
{
	 void add(int a,int b)
	{
	 int sum =a+b;
	 System.out.println(sum);
	}
	 void add(float a,float b)
	{
	 float sum =a+b;
	 System.out.println(sum);
	}
}
class B extends A
{
	void disp()
	{
	System.out.println("Hello");
	}
}
class c
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		B obj=new B();
		obj.add(a,b);
		obj.add(2.3f,3.3f);
		
	}
}
  
  


  

