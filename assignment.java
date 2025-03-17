import java.util.*;
class assignment
{
public static void main (String args[])
{
Scanner sc=new Scanner(System.in);
int a=sc.nextInt();
int b=sc.nextInt();
//assignment operator
System.out.println(a+=b);
System.out.println(a-=b);
System.out.println(a*=b);
System.out.println(a/=b);

//relational operator
System.out.println(a<b);
System.out.println(a>b);
System.out.println(a<=b);
System.out.println(a>=b);
System.out.println(a=b);
System.out.println(a!=b);

//logical oparator
System.out.println(a<b && a>b);
System.out.println(a<b || a>b);
}
}

