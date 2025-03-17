import java.util.*;
public class armstrongno
{
public static void main(String args[])
{
int n=153,num,sum=0,i;
i=n;
while(n>0)
{
num=n%10;
sum=sum+(num*num*num);
n=n/10;
}
System.out.println("Sum is"+sum);
if(i==sum)
{
System.out.println("Armstrong no");
}
else
{
System.out.println("Not Armstrong no");
}
}
}


