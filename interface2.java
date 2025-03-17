interface drawable
{
	void print();
}
class circle implements drawable
{
	public void print()
	{
		System.out.println("Circle");
	}
}
class rectangle implements drawable
{
	public void print()
	{
		System.out.println("rectangle");
	}
}
class interface2
{
	public static void main(String args[])
	{
		drawable d=new circle();
		d.print();
		drawable r=new rectangle();
		r.print();
	}
}
