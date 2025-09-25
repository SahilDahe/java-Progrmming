import java.util.Scanner;

public class Throwkeyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your  age ");
        int age = sc.nextInt();

        if(age<18){
            System.out.println("Illegal User ");
            throw new ArithmeticException("Age is less than 18");
        }
        else{
            System.out.println("Valid User");
        }
        System.out.println("welcome \n YOU CAN NOW VOTE 3...2...1..");
        
    }
    
}
