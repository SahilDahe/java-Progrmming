import java.util.*;
public class Prime
{
	public static void main(String[] args)
{
	int a,flag=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no : ");
	a=sc.nextInt();
	if(a==2)
		{
			System.out.println(" the no is prime");
		}
	else{	
		for(int i=a-1;i>2;i--)
		{
	  			if(a%i==0)
		{
			System.out.println(" the no is not prime");
			flag=1;
			break;
		}
		
		}
			if(flag!=1)
		{
			System.out.println(" the no is prime");
		}
	}
	
	
}
}