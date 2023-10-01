public class slip19b {
    public static void main(String[] args) {
        int n=10;
        System.out.println("fibo Series:");
        for(int i=0;i<n;i++)
        {
            System.out.println(fibo(i)+"");   
        }
    }
    public static int fibo(int n)
    {
        if(n<=1)
        {
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
}
