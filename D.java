import java.util.*;
class A
{
	int a=10;
}
class B extends A
{
	void disp()
	{
		int a=20;
		System.out.println("Subclass a is :"+a);
		System.out.println("Superclass a is :"+super.a);
	}
}
class D
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.disp();
	}
}
