interface printable
{
	void print();
}
class interfacex implements printable
{
	public void print()
	{
		System.out.println("Hello");
	}
	public static void main(String args[])
	{
		interfacex e=new interfacex();
		e.print();
	}
}

