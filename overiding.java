class A
{
	void disp()
	{
		System.out.println("This is a Super class");
	}
}
class B extends A
{
	void disp()
	{
		super.disp();
		System.out.println("This is a Sub class");
	}
}
class overiding
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.disp();
	}
}
