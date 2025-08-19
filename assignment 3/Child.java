//program to demonstrate inheritance and method overloading

class Parent{

String Surname="Dahe";
int balance= 5000000;

public void display(){
System.out.println("Surname : "+Surname+". balance : "+ balance);

}

} 
public class Child extends Parent{
public static void main(String Args[]){

Child c=new Child();
c.display();

}

}
