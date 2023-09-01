import java.io.*;
class NumberZero extends Exception{
	public NumberZero(){     
		super("Zero Number Exception");
	}
}
class slip6bexcept{
	static void addDigit(int num){
		if(num<10)
			System.out.println("Addition of first and last digit = "+num);
		else{
			int lastDigit=0,firstDigit=0;
			lastDigit=num%10;
			while(num >= 10){
				num = num / 10;
    			}
    			firstDigit = num;

		System.out.println("Addition of first and last digit = "+ (firstDigit + lastDigit));
	}

}
	public static void main(String a[]) throws IOException{ 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter Number=");
		int number=Integer.parseInt(br.readLine());
		try
        {
		if(number==0)
			throw new NumberZero();

		else
			addDigit(number);
		}
		catch(NumberZero e){
		System.out.println("Number is 0");
		System.out.println(e.getMessage());
		}
	}
}
