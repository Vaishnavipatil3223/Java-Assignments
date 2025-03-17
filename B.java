import java.util.*;
class A
{
	
	
	void display()
	{
	System.out.println("hi Chaitali");
	}
}
class B extends A
{

        void disp()
        {
         System.out.println("welcome");
        }
}
class inheritance
{
  
       public static void main(String args[])
       {
	
	 B obj=new B();
	 obj.display();
	 obj.disp();
	
       }
}

