package helloworld;

import java.util.Scanner;

public class HelloWorld2 {

	public static void main(String[] args) {
		System.out.print("Input Number:");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		if ((num % 2)==0) {
			System.out.println("even number");
		}
		else {
			System.out.println("odd number");
		}
		System.out.println("End!");
			
		
	}
}
