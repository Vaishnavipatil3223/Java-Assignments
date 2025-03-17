class A
{
	int a=10;
	int b=20;
	void display()
	{
		System.out.println("Display Method of superclass");
	}
	void calculate()
	{
		
		System.out.println("Multiplication is"+(a*b));
	}
}
class B extends A
{
	int a=10;
	int b=20;
	void display()
	{
		super.display();
		System.out.println("Display method of subclass");
	}
	void addition()
	{
		
		System.out.println("Addition is"+(a+b));
	}
	void calculate()
	{
		super.calculate();
		System.out.println("Subtraction is"+(a-b));
	}
}
class methodoverriding 
{
	public static void main(String args[])
	{
		B obj=new B();
		obj.display();
		obj.addition();
		obj.calculate();
	}
}
	
	
