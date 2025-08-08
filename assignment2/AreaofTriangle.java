import java.util.*;
public class AreaofTriangle{

double height,base,result;
public double area(){
 result = 0.5*height*base;
return result; 
}
public static void main(String args[]){
AreaofTriangle a=new AreaofTriangle();
Scanner s= new Scanner(System.in);
System.out.println(" enter height, and base of the triangle");
a.height=s.nextInt();
a.base=s.nextInt();
System.out.println(" area of the triangle is : "+a.area());

}
} 