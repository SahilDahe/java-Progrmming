import java.util.*;
public class Biggestno
{
	public static void main(String[] args)
{
	int a,b,c;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the no`s : ");
	a=sc.nextInt();
	b=sc.nextInt();
	c=sc.nextInt();
	
	if(a>=b && a>=c)
		{
			System.out.println("biggest of the three is : "+a);
		}
	else if(b>=c && b>=a)
		{
			System.out.println("biggest of the three is : "+b);
		}
	else
		{
			System.out.println("biggest of the three is : "+c);
		}
	
}
}