class constoverloading
{
        int id;
        String name;
        int age;
        
	constoverloading(int i,String n)
	{
		id=i;
		name=n;
	}
	constoverloading(int i,String n,int a)
	{
		id=i;
		name=n;
		age=a;
	}
	void display()
	{
		System.out.println("id is :"+id+"\n"+"Name is :"+name+"\n"+"Age is :"+age);
	}
	
public static void main(String args[])
{
	constoverloading p=new  constoverloading(111,"Vaishnavi");
	constoverloading p1=new constoverloading(112,"Chaitali",19);
	constoverloading p2=new constoverloading(113,"Sakshi",19);
	constoverloading p3=new  constoverloading(114,"Dipali",19);
	p.display();
	p1.display();
	p2.display();
	p3.display();
}
}
