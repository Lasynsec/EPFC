import java.util.Scanner;

public class Exercice05 {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);

		System.out.print("Type the first number : ");
		int firstNumber = scan.nextInt();

		System.out.print("Type the first number : ");
		int secondNumber = scan.nextInt();

		System.out.println(firstNumber + " + " + secondNumber + " = " + (firstNumber+secondNumber));
	}
} 
