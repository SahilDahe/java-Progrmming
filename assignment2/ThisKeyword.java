public class ThisKeyword{

int emp_id,salary;
String name;

public ThisKeyword(int emp_id,String name,int salary){

this.emp_id=emp_id;
this.name=name;
this.salary=salary;

}
public void display(){
System.out.println("Emp.id : "+emp_id+"  "+"Name : "+name+" "+"Salary : "+salary);
}

public static void main(String args[]){

ThisKeyword c=new ThisKeyword(67,"Sahil",1901);

c.display();


}
}