package studio1;

import java.util.Scanner;

public class Average {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("The first integers to be averaged?");
		int x = in.nextInt();
		System.out.println("The second integers to be averaged?");
		int y = in.nextInt();
		double average = (x+y)/2;
		System.out.println(average);
	}

}
