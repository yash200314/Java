/*Write a java program to accept a number from user, if 
it zero then throw user defined Exception “Number Is Zero”, otherwise calculate the 
sum of first and last digit of that number. (Use static keyword). */

import java.io.*;

class NumberZero extends Exception {
	public NumberZero(String message) {
		super("zero number Exception");
	}
}

public class slip6bexcept {
	static void addDigit(int num) {
		if (num < 10) {
			System.out.println("Addition of first and last digit :" + num);
		} else {
			int lastDigit = 0, firstDigit = 0;
			lastDigit = num%10;
			while(num>=10)
			{
				num = num/10;
			}
			firstDigit=num;
			System.out.println("Addition of first and last digit is :"+(firstDigit+lastDigit));
		}
	}
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int number =Integer.parseInt(br.readLine());
		try{
			if(number==0)
			{
				throw new NumberZero("invalid number broo very chalak bro");
			}
			else{
				addDigit(number);
			}
		}
		catch(NumberZero e){
			System.out.println("number is 0");
			System.out.println(e.getMessage());
		}
		
	}

}
