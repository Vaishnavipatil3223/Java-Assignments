class array2
{
	public static void main(String args[])
	{
		int total=0;
		int arraylist[]={2,3,4,5,6};
		System.out.println("Array elemts are:");
	 	for(int i=0;i<arraylist.length;i++)
	 	{
	 	    
			System.out.println(arraylist[i]);
			total+=arraylist[i];
		}
		System.out.println("Total is:"+total);
		int max=arraylist[0];
		for(int i=1;i<arraylist.length;i++)
		{
			if(max<arraylist[i])
			{
				max=arraylist[i];
			}

		}
		System.out.println("Maximum array element is"+max);
		int min=arraylist[0];
		for(int i=1;i<arraylist.length;i++)
		{
			if(min>arraylist[i])
			{
				min=arraylist[i];
			}

		}

		System.out.println("Minimum array element is"+min);
		//swapping of array elemsts
		for(int i=0;i<arraylist.length;i++)
		{
				for(int j=arraylist.length-1;j>=0;j--)
				{
					int temp;
					arraylist[i]=arraylist[j];
					arraylist[j]=temp;
				}
		}
		System.out.println("After swapping Array elemts are:");
	 	for(int i=0;i<arraylist.length;i++)
	 	{
	 	    
			System.out.println(arraylist[i]);
		
		}
	}
}

	
		
	
