package helloworld;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.print("첫번째 정수를 입력하세요 :");
		Scanner input1 = new Scanner(System.in);
		int num1 = input1.nextInt();

		System.out.print("두번째 정수를 입력하세요 :");
		Scanner input2 = new Scanner(System.in);
		int num2 = input2.nextInt();

		System.out.print("연산자를 입력하세요 :");
		Scanner input3 = new Scanner(System.in);
		String operator= input3.next();

		double result=0;
		switch(operator) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		
		}
		System.out.print("계산결과는 " + result + " 입니다.");

	}

}
