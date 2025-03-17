public class recursionex
{
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		else
		{
			return(n*fact(n-1));
		}
	}
	public sattic void main(String args[])
	{
		System.out.println("Factorial of 5 is"+fact(5));
	}
}
