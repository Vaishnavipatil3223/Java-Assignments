abstract class first
{
	abstract void disp();
}
class abstract1 extends first
{
	public void disp()
	{
		System.out.println("Abstraction");
	}
	public static void main(String args[])
	{
		abstract1 a=new abstract1();
		a.disp();
	}
}
	
