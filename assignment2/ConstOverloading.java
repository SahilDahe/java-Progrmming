public class ConstOverloading 
{
    int roll;
    String name;
    int age;
	
	public ConstOverloading(int roll, String name)
    {
        this.roll=roll;
        this.name=name;
        System.out.println("Roll NO: "+roll+" Name : "+name);

    }

    public ConstOverloading(int roll, String name , int age)
    {
        this.roll=roll;
        this.name=name;
        this.age=age;
        System.out.println("Roll NO: "+roll+" Name : "+name+" Age : "+age);

    }
    
     public static void main(String[] args) 
    {
        ConstOverloading s1= new ConstOverloading(10,"Sahil");
        ConstOverloading s2= new ConstOverloading(10,"Sahil",18);
    }
    
}