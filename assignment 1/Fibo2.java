import java.util.Scanner;

public class Fibo2{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0, b = 1;
        System.out.println("Enter terms:");
        int n = sc.nextInt();
        
        if (n <= 0) {
            System.out.println("Enter valid");
        } else if (n == 1) {
            System.out.println(a);
        } else {
            for (int i = 0; i < n; i++) {
                System.out.print(fibo(i) + " ");
            }
        }
    }

    public static int fibo(int n) {
        if (n <= 1) return n;
        return fibo(n - 1) + fibo(n - 2); 
    }
}