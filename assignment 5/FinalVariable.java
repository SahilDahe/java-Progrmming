class TestFinalVariable {
    final int x = 10;   // final variable

    void display() {
        
        System.out.println("Value of x: " + x);
    }
    
    final void show() {   // final method
        System.out.println("This is a final method.");
    }
}

class FinalVariable extends TestFinalVariable {
public static void main(String[] args) {
    FinalVariable fv = new FinalVariable();
    fv.display();
    fv.show();
    
}    

}
