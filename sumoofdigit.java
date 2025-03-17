class sumofdidgit
{
	public static void main(string args[])
	{
	int num=121;
	int sum=0,int rem;
	while(num>0)
	{
	rem=num%10;
	sum=sum+rem;
	num=num/10;
	}
	System.out.pritnln("Sum is"+sum);
	}
}

