import java.util.*;
class Swap2{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a,b;
a=s.nextInt();
b=s.nextInt();
System.out.println(" before swapping a = "+a+" before swapping b = "+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println(" after swapping a = "+a+" after swapping b = "+b);
}
}