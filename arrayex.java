import java.util.*;
public class arrayex
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int [] roll_no=new int[5];
float [] percentage=new float[5];
String [] name=new String [5];
System.out.println("Enter the how many record you want to enter");
int n=sc.nextInt();

for(int i=1;i<=n;i++)
{
System.out.println("Enter rollno : ");
roll_no[i]=sc.nextInt();
System.out.println("Enter percentage :");
percentage[i]=sc.nextFloat();
System.out.println("Enter Name : ");
name[i]=sc.next();

}

for(int i=1;i<=n;i++)
{
System.out.println("Display rollno = "+roll_no[i]);

System.out.println("Display percentage = "+percentage[i]);

System.out.println("Display name = "+name[i]);


}
}
}


