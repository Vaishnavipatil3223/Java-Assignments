interface A
{
	void disp();
}
interface B
{
	void display();
	
}
interface C
{
	void displayy();
	
}
class multiple implements A,B,C

{ 
	
	public void disp()
	{
		System.out.println("Subclass 1");
	}
	public void display()
	{
		System.out.println("Superclass 2");
	}
	
	public void displayy()
	{
		System.out.println("Superclass 3");
	}
}
class multipleinheritance
{
	
	public static void main(String args[])
	{
		multiple obj=new multiple();
		obj.disp();
		obj.display();
		obj.displayy();
	}
}
