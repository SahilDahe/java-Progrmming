class Parent{
    void display(){
        System.out.println("in parent class");
    }
}
class Child extends Parent{
    
    void display(){
        super.display();
        System.out.println("in Child class");
    }
}


public class SuperKeyword {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }
}
