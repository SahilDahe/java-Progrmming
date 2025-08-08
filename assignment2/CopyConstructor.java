public class CopyConstructor{

int emp_id,salary;
String name;

public CopyConstructor(int id,String n,int sal){

emp_id=id;
name=n;
salary=sal;
System.out.println("Emp.id : "+emp_id+"  "+"Name : "+name+" "+"Salary : "+salary);
}
public CopyConstructor(CopyConstructor obj){

emp_id=obj.emp_id;
name=obj.name;
salary=obj.salary;
System.out.println("Emp.id : "+emp_id+"  "+"Name : "+name+" "+"Salary : "+salary);
}

public static void main(String args[]){

CopyConstructor c=new CopyConstructor(67,"Sahil",1600);
CopyConstructor c1=new CopyConstructor(c);



}
}