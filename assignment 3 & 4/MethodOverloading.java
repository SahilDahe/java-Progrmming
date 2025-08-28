//Static Polymrphism - compile time - poly-Mehtod ovreloading //

import java.util.Scanner;

public class MethodOverloading{
 
    // Method to add two integers
    public int add(int a, int b) 
    {
        return a + b;
    }

    // Method to add three integers
    public int add(int a, int b, int c) 
    {
        return a + b + c;
    }

    // Method to add two double values
    public double add(double a, double b) 
    {
        return a + b;
    }

    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        MethodOverloading m = new MethodOverloading();
        System.out.println("enter two integer number");
        System.out.println("Addition is "+m.add(s.nextInt(),s.nextInt()));
        System.out.println("enter three integer number");
        System.out.println("Addition is "+m.add(s.nextInt(),s.nextInt(),s.nextInt()));
        System.out.println("enter two decimal number");
        System.out.println("Addition is "+m.add(s.nextDouble(),s.nextDouble()));
    }
}
