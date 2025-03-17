import java.util.*;
public class primelist
{
public static void main(String args[])
{
int n=100;
int i;
for( i=2;i<100;i++)
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
