import java.util.Scanner;

public class Exercice04{
	public static void main(String [] args){

		Scanner scan = new Scanner(System.in);
		

		System.out.print("Type the frist number : ");
		int firstNumber = scan.nextInt();

		System.out.print("Type the second number : ");
		int secondNumber = scan.nextInt();

		System.out.println("Before reversing");
		System.out.println("The first number is " + firstNumber + " and the second Number is " + secondNumber);

		int tempNumber = firstNumber;
		firstNumber = secondNumber;
		secondNumber = tempNumber;
		
		System.out.println("After reversing");
		System.out.println("The first number is  " + firstNumber + " and the second number is " + secondNumber);
	}
}
