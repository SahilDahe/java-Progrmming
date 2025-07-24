import java.util.*;
public class Recursion{

public int fact(int n){
 int total=1;
if(n>=1)
total=n*fact(n-1);
return total;
}


public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n;
System.out.println("enter the no");
n=s.nextInt();
Recursion f=new Recursion();
int k=f.fact(n);
System.out.println("the factorial of "+n+" is "+k);



}}
