/* Define a class MyNumber having one private int
data member. Write a default constructor to initialize it to
0 and another constructor to initialize it to a value (Use
this). Write methods isNegative, isPositive, isZero, isOdd,
isEven. Create an object in main.Use command line
arguments to pass a value to the Objec*/

public class Slipani4 {
    private final int num;

    Slipani4() {
        num = 0;
    }

    Slipani4(int num) {
        this.num = num;

    }

    public void iseven() {
        if (num % 2 == 0) {
            System.out.println("number is even" + num);

        }
    }

    public void isodd() {
        if (num % 2 != 0) {
            System.out.println("number is odd" + num);
        }
    }

    public void isnegative() {
        if (num < 0) {
            System.out.println("number is negative" + num);

        }
    }

    public void ispositive() {
        if (num > 0) {
            System.out.println("number is positive");

        }

    }

    public void iszero() {
        if (num == 0) {
            System.out.println("number is zero" + num);
        }
    }

    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        Slipani4 a = new Slipani4(x);
        a.iseven();
        a.isnegative();
        a.isodd();
        a.ispositive();
        a.iszero();
    }
}
