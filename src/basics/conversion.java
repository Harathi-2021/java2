package basics;

import java.util.Scanner;

public class conversion {

	public static void main(String[] args) {
		int hours,seconds,minutes;
		Scanner Sc=new Scanner(System.in);
		System.out.println("Please enter hours:");
		hours=Sc.nextInt();
		minutes=hours*60;
		System.out.println(minutes+"minutes");
	}

}
