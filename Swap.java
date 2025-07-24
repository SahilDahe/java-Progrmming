import java.util.*;
class Swap{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a,b,temp;
a=s.nextInt();
b=s.nextInt();
System.out.println(" before swapping a = "+a+" before swapping b = "+b);
temp=a;
a=b;
b=temp;
System.out.println(" after swapping a = "+a+" after swapping b = "+b);
}
}