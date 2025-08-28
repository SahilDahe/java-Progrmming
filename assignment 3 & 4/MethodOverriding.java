class RBI{

    int roi=7;
    void display(){
    System.out.println("return on intrest : "+roi);
    }
    }
    class SBI extends RBI{
    int roi=8;
    void display(){
        System.out.println("return on intrest : "+roi);
    }}
    public class MethodOverriding{
        public static void main(String[] args) {
            SBI c = new SBI();
            c.display();
        }
    }