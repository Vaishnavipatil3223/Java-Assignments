import java.util.*;
class A
{       int a=5,b=2;
	void disp()
	{
		 System.out.println("Superclass");
		 System.out.println("Addition="+(a+b));
	}
	 
}
class B extends A
{
	 void display()
	{
		 System.out.println("Derived class first");
		 System.out.println("Subtraction="+(a-b));
	}
}
class C extends B
{
	 void displayy()
	{
		 System.out.println("Derived class second");
		 System.out.println("Multiplication="+(a*b))z;
	}
}
class E
{
	public static void main(String args[])
	{
		
		C obj=new C();
		obj.disp();
		obj.display();
		obj.displayy();
		
	}
}
  
