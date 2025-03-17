import java.util.*;
import java.math.*;
class mathpackage
{
	public static void main(String args[])
	{
		int a=4,b=3;
		double k=-8.5;
		double m=5.6;
		double c=Math.pow(a,b);
		System.out.println("Power value is: "+c);
		double d=Math.sqrt(a);
		System.out.println("Sqrt value is: "+d);
		System.out.println("min value is: "+Math.min(a,b));
		System.out.println("max value is: "+Math.max(a,b));
		System.out.println("abs value is: "+Math.abs(k));
		System.out.println("ceil value is: "+Math.ceil(m));
		System.out.println("floor value is:"+Math.floor(m));
		System.out.println("floor value is: "+Math.floor(k));
		System.out.println("sin 0 value is: "+Math.sin(0));
		System.out.println("sin 45 value is: "+Math.round(Math.sin(45)));
		System.out.println("sin 0 actual value is: "+Math.round(Math.sin(0)));
		System.out.println("cos 90 value is: "+Math.cos(90));
		System.out.println("round value is"+Math.round(k));
	}
}
