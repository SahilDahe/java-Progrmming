
interface Animal {
    void eat();
}

interface Bird {
    void fly();
}

public class MultipleInheritanceExample implements Animal, Bird {
    
    // Implementation of Animal interface method
    public void eat() {
        System.out.println("Animal is eating food.");
    }

    // Implementation of Bird interface method
    public void fly() {
        System.out.println("Bird is flying in the sky.");
    }

    public static void main(String[] args) {
        
        Animal a = new MultipleInheritanceExample();
        a.eat();

        
        Bird b = new MultipleInheritanceExample();
        b.fly();

    }
}
