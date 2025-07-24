import java.util.*;
public class Even_Odd{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("enter the size of the array");
int sumE=0, sumO=0;
int size=sc.nextInt();
int a[]=new int[size];
System.out.println("enter the element of the array");
for(int i=0;i<size;i++){
a[i]=sc.nextInt();

if(a[i]%2==0){
 sumE=sumE+a[i];
}
else{
 sumO=sumO+a[i];
}
}
System.out.println("the add of even no is "+sumE);
System.out.println("the add of odd no is "+sumO);
}}
