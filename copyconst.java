class copyconst
{
	int id;
	String name;
	copyconst(int i,String n)
	{
	id=i;
	name=n;
	}
	copyconst(copyconst c)
	{
		id=c.id;
		name=c.name;
		
	}
	void display()
	{
	System.out.println("Id : "+id);
	System.out.println("Name : "+name);
	}
	public static void main(String args[])
	{
		copyconst c1=new copyconst(111,"Vaishnavi");
		copyconst c2=new copyconst(c1);
		c1.display();
		System.out.println("Using the object copy of the constructor i.e copy constructor");
		c2.display();
	}
}
		
