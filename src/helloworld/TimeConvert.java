package helloworld;

import java.util.Scanner;

public class TimeConvert {

	public static void main(String[] args) {

		System.out.print("Input seconds:");
		Scanner input = new Scanner(System.in);
		int time;
		time = input.nextInt(); 

		double day, hours, minutes, seconds;

		seconds = time;
		minutes = time / 60;
		hours = time/ (60*60);
		day = time/ (60*60*24);

		System.out.println("seconds = "+ seconds + " minutes= "+ minutes +
				" hours= " + hours + " day= " + day);

		if (day<365) {
			System.out.println(time +"seconds는  1year를 초과하지 않습니다.");
		}
		else {
			System.out.println(time +"seconds는 1year를 초과합니다.");
		}
	}

}
