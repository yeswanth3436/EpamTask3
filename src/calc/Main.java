package calc;
import calc.Addition;
import calc.Subtration;
import calc.Multiplication;
import calc.Divide;
import java.util.*;

public class Main {
	
	public static void main(String args[])throws Exception
	{
	
	Scanner in =new Scanner(System.in);
	System.out.println("Calculator Application");
	
	int v1;
	int v2;
	
	System.out.println(" 1-Addition");
	System.out.println(" 2-Subtraction");
	System.out.println(" 3-Divide");
	System.out.println(" 4-multiplication");
	
	System.out.println("Enter 1 value");
	v1=in.nextInt();
	System.out.println("Enter Value2");
	v2=in.nextInt();
	
	int s;
	s=in.nextInt();
	
	if(s==1)
	{
		Addition a=new Addition();
		int result=a.add(v1,v2);
		System.out.println("---performing Addition Operation----");
		System.out.println("result is "+result);
		
	}
	else if(s==2)
	{
		Subtration s1=new Subtration();
		int result2=s1.sub(v1,v2);
		System.out.println("---performing Subtraction Operation---");
		System.out.println("result is "+result2);
	}
	else if(s==3)
	{
		Divide d=new Divide();
		int result3=d.div(v1,v2);
		System.out.println("---performing Division Operation---");
		System.out.println("result is "+result3);
	}
	else if(s==4)
	{
		Multiplication m=new Multiplication();
		int result4=m.mul(v1,v2);
		System.out.println("---performing Multiplication Operation-----");
		System.out.println("result is "+result4);
	}
	
	}
	

}