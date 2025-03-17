//write the program for switch case statement
import java.util.Scanner;

public class switchcase
{
	public static void main(String args[])
	{
	int sum, a=5, b=7;
	while(true)
	{
		System.out.println("Enter your choice\n1.Addition\n2.Substraction\n3.multiplication");
		Scanner s = new Scanner (System.in);
		int ch=s.nextInt();
		switch(ch)
		{
	case 1:
		sum=a+b;
		System.out.println("Addition is"+sum);
		break;
	case 2:
		sum=a-b;
		ystem.out.println("Substraction is"+sum);
		break;
	case 3:
		sum=a*b;
		System.out.println("multiplication is"+sum);
		break;
	case 4:
		return;
		default:
		System.out.println("wrong choice\n");
	}
      }
    } 
  }
