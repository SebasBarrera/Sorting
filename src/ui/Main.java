package ui;

import java.util.Scanner;

import sorting.*;

public class Main {

	private static Scanner sc;
	public static BubbleSort b;
	public static IncertionSort i;
	public static SelectionSort s;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("How many arrays do you want to sort: )");
		String cases = sc.nextLine();
		int[] array;
		int c = Integer.parseInt(cases);
		for (int cas = 0; cas < c; cas++) {
			System.out.print("Write the size of the array #"+cas+": ");
			String size = sc.nextLine();
			array = new int[Integer.parseInt(size)];
			System.out.println("Now write the numbers of the array");
			for (int n = 0; n < array.length; n++) {
				String num = sc.nextLine();
				int number = Integer.parseInt(num);
				array[n] = number;
			}
			System.out.println(b.sort(array)+"\n\n");
			System.out.println(i.sort(array)+"\n\n");
			System.out.println(s.sort(array)+"\n\n");
			
		}
	}
}
