public class TryCatchCodePra {
    public static void main(String[] args) {
        int a =100;
        int b = 0;
        try {
            int c = a/b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("unable to divide ");
            System.out.println(e);   
        }
        System.out.println("end of program");
    }
    
}
