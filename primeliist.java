import java.util.*;
public class primelist
{
public static void main(String args[])
{
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
int flag=0;
int i;
for( i=2;i<n;i++)
{
if(i==2)
{
System.out.println(i);
}
else if(n%i!=0)
{
System.out.println(i);
}
}
}
}
