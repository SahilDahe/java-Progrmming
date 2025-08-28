import java.util.*;

class Animal {
    String name;
    int age;

    public Animal() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter animal name: ");
        name = s.next();
        System.out.println("Enter age: ");
        age = s.nextInt();
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Dog extends Animal {
    String breed;

    public Dog() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter dog breed: ");
        breed = s.next();
    }

    public void showDog() {
        displayInfo();
        System.out.println("Breed: " + breed);
    }
}

class Cat extends Animal {
    String color;

    public Cat() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter cat color: ");
        color = s.next();
    }

    public void showCat() {
        displayInfo();
        System.out.println("Color: " + color);
    }
}

public class Hierarchical {
    public static void main(String[] args) {
        System.out.println("Creating Dog Object:");
        Dog d = new Dog();
        d.showDog();

        System.out.println("\nCreating Cat Object:");
        Cat c = new Cat();
        c.showCat();
    }
}
