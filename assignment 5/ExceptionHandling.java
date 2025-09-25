/*
 import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("enter two no");
        a=s.nextInt();
        b=s.nextInt();
       System.out.println("the addition is = "+a+b);
        System.out.println("the division is = "+a/b);
        System.out.println("the substraction is is = "+a-b);
        
    s.close();
    }
}

 */

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a,b;
        System.out.println("enter two no");
        a=s.nextInt();
        b=s.nextInt();
        System.out.println("the addition is = "+(a+b));
        try{
            System.out.println("the division is = "+(a/b));
        }
        catch(Exception e){  //Exception is a built  in class and e is an instance of try
            //we can also declare the name of array in the parameter  eg ArithmeticException and etc
            System.out.println("you cant divide by 0   --- "+e);
        }
        System.out.println("the substraction is is = "+(a-b));
    s.close();
    }
}
