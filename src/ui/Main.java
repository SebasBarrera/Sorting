package ui;

import java.util.Scanner;

import sorting.*;

public class Main {

	private static Scanner sc;
	public static BubbleSort b;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		String cases = sc.nextLine();
		int[] array;
		int c = Integer.parseInt(cases);
		for (int cas = 0; cas < c; cas++) {
			String size = sc.nextLine();
			array = new int[Integer.parseInt(size)];
			for (int n = 0; n < array.length; n++) {
				String num = sc.nextLine();
				int number = Integer.parseInt(num);
				array[n] = number;
			}
			System.out.println(b.sort(array));
		}
	}
	
	

}
