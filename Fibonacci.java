import java.util.Scanner;

public class Fibonacci {
	static int x;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter number to test");
		
		x = input.nextInt();
		
		System.out.print("The nth term of the Fibonacci sequence is " + Fib(x - 1));
	}
	
	/**
	 * function that calculates the Fibonacci sequence recursively
	 * @param x 	the integer given from the user
	 * @return		the nth term of the Fibonacci sequence
	 */
	public static int Fib(int x) {
		if (x <= 1)
			return x;
		
		return Fib(x - 1) + Fib(x - 2);
	}
}