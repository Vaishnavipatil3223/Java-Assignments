class parameterconst
{
        int id;
        String name;
        int age;
        
	parameterconst(int i,String n)
	{
		id=i;
		name=n;
	}
	void display()
	{
		System.out.println("id is :"+id+"\n"+"Name is :"+name);
	}
	
public static void main(String args[])
{
	parameterconst p=new parameterconst(111,"Vaishnavi");
	p.display();
}
}
