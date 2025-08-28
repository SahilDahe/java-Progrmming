class Parent{
    String colour = "black";
    }

class Child extends Parent{
     String colour = "white";
    void display(){
        System.out.println("in Parent class : "+super.colour);
        System.out.println("in Child class : "+colour);
    }
}


public class SuperKeyword3 {
    public static void main(String[] args) {
        Child c=new Child();
        c.display();
    }
}
