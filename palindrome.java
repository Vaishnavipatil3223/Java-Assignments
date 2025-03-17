import java.util.*;
public class palindrome
{
public static void main(String args[])
{
int n=121,digit,sum=0,i;
i=n;
while(n>0)
{
digit=n%10;
sum=(sum*10)+digit;
n=n/10;
}
System.out.println("Sum is"+sum);
if(i==sum)
{
System.out.println("Palindrome no");
}
else
{
System.out.println("Not palindrome no");
}
}
}


