package pack;
public class rectangle 
{
	int length;
	int breadth;
	int height;
	public rectangle(int l,int b)
	{
		length=l;
		breadth=b;
		
		
	}
	public rectangle(int l,int b,int h)
	{
		length=l;
		breadth=b;
		height=h;
		
	}
	public void area()
	{
		System.out.println("Area of rectangle is:"+(length*breadth));
	}
	public void volume()
	{
		System.out.println("Volume of rectangle is:"+(length*breadth*height));
	}
}

