import java.util.*;
class Fibo{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int a=0,b=1,c,n;

System.out.println(" enter a series no ");
n=s.nextInt();

if(n<=0)
System.out.println(" enter a positive no");

else if(n==1)
System.out.println(a);=k

else{
 System.out.println(a+"\n"+b);
for(int i=2;i<n;i++){
c=a+b;
System.out.println(c);
a=b;
b=c;
}
}
}}