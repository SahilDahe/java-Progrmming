public class NullPointerException {
    public static void main(String[] args) {
        String n=null;
        
        try{
            System.out.println(n.length());
        }
        catch(Exception e){
            System.out.println("string is pointed to null \n"+e);

        }
    }
}
