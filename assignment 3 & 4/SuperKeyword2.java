class Parent {
    Parent(String name) {
        System.out.println("in parent class : " + name);
    }
}

class Child extends Parent {
    Child() {
        super("sahil");
        System.out.println("in Child class");
    }
}

public class SuperKeyword2 {
    public static void main(String[] args) {
        Child c = new Child();
    }
}
