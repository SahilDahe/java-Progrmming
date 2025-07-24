import java.util.*;
public class Max
{
	public static void main(String[] args)
{
	int size,max=0,min;
	Scanner sc=new Scanner(System.in);
	System.out.println("enter the size : ");
	size=sc.nextInt();
	int[] a=new int[size];
	System.out.println("enter the no in array : ");
	
	for(int i=0;i<size;i++)
	{
		a[i]=sc.nextInt();

		if(a[i]>max)
			{max=a[i];}
	}
	min=a[0];
	for(int i=0;i<size;i++)
	{
		if(a[i]<min)
			{min=a[i];}
	}
	
	
	
	System.out.println("the maximum no is : "+max);
   System.out.println("the minimum no is : "+min);
}
}