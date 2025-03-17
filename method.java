abstract class A
{
	abstract void display();
	abstract void calculate();
}
class b extends A
{

	int a=10,b=30,c;
	void display()
	{
		System.out.println("display Subclass Method");
	}
	void addition()
	{
		
		c=a+b;
	}
	void calculate()
	{
	
		System.out.println("Addition is:"+c);
	}
}
class method
{
	public static void main(String args[])
	{
		b b1=new b();
		b1.display();
		b1.addition();
		b1.calculate();
	}
}

