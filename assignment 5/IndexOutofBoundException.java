
import java.util.Scanner;

public class IndexOutofBoundException {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("enter the size of array ");
        int n=s.nextInt();

        int a[]=new int[n];
      
        for(int i =0;i<=n;i++){
        try{
        
            System.out.println("enter the element : "+(i+1));
            a[i]=s.nextInt();
        }
        catch(Exception e){  //Exception is a built  in class and e is an instance of try
            //we can also declare the name of array in the parameter  eg ArithmeticException and etc
            System.out.println("array index out bound \n"+e);
        }}
        
    s.close();
    }
}
