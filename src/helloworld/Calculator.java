package helloworld;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		System.out.print("ù��° ������ �Է��ϼ��� :");
		Scanner input1 = new Scanner(System.in);
		int num1 = input1.nextInt();

		System.out.print("�ι�° ������ �Է��ϼ��� :");
		Scanner input2 = new Scanner(System.in);
		int num2 = input2.nextInt();

		System.out.print("�����ڸ� �Է��ϼ��� :");
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
		System.out.print("������� " + result + " �Դϴ�.");

	}

}
