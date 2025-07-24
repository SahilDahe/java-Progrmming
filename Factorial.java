import java.util.*;
public class Factorial
{
	public static void main(String[] args)
{
	int a,fact=1;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no : ");
	a=sc.nextInt();
	for(int i=a;i>1;i--)
	{
	  fact*=i;
	}
	
	System.out.println("factorial of the no is : "+fact);
}
}