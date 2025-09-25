 interface Father {
    abstract void BringWater(); 
}

interface Mother {
    abstract void BringWater();
    
}

public class MultipleInheritance implements Father,Mother {
    public void BringWater(){
        System.out.println("Brought Water for Father and Mother");
    }

    public static void main(String[] args) {
        Father f = new MultipleInheritance();
        f.BringWater();
        Mother m = new MultipleInheritance();
        m.BringWater();
    }
}
