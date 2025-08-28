import java.util.*;

// Grandparent class
class Grandparent {
    String surname;
    int balance;

    // Constructor
    public Grandparent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your surname: ");
        surname = s.next();
        System.out.println("Enter your balance: ");
        balance = s.nextInt();
    }

    // Method to display data
    public void display() {
        System.out.println("Surname: " + surname + ". Balance: " + balance);
    }
}

// Parent class extends Grandparent
class Parent extends Grandparent {
    String name;
    int account;

    // Constructor
    public Parent() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name: ");
        name = s.next();
        System.out.println("Enter your account: ");
        account = s.nextInt();
    }

    // Method to show data
    public void show() {
        System.out.println("Name: " + name + "  Account: " + account);
    }

   
}

// Child class extends Parent
public class Multilevel extends Parent {
    public static void main(String[] args) {
        Multilevel m = new Multilevel(); // Calls constructors of all parent classes
        m.display();       // Method from Grandparent
        m.show();          // Method from Parent
        
    }
}
