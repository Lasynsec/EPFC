import java.util.Scanner;

public	class Exercice06{
	public static void main(String [] args){	
		Scanner scan = new Scanner(System.in);

		System.out.print("Type the first number : ");
		int firstNumber = scan.nextInt();

		System.out.print("Type the second  number : ");
		int secondNumber = scan.nextInt();

		System.out.println("The average of " + firstNumber + " and " + secondNumber + " is " + (firstNumber + secondNumber)/2);	
	}
}
