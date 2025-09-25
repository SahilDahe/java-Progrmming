public class ThrowsKeyword {
    public void display() throws ArithmeticException{
        int a=10,b=0,c;
        c=a/b;
        System.out.println(c);
    }
    public static void main(String[] args) {
        ThrowsKeyword th = new ThrowsKeyword();
        th.display();
        System.out.println("hello ...!");
    }
}
