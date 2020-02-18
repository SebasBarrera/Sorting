package ui;

import java.util.Scanner;

import sorting.*;

public class Main {

	private static Scanner sc;
	public static BubbleSort b;
	public static InsertionSort i;
	public static SelectionSort s;

	public static void main(String[] args) {
		sc = new Scanner(System.in);
		System.out.print("How many arrays do you want to sort: )");
		String cases = sc.nextLine();
		int[] array;
		int c = Integer.parseInt(cases);
		for (int cas = 0; cas < c; cas++) {
			System.out.print("Write the size of the array #"+cas+++": ");
			String size = sc.nextLine();
			array = new int[Integer.parseInt(size)];
			System.out.println("Now write the numbers of the array");
			for (int n = 0; n < array.length; n++) {
				String num = sc.nextLine();
				int number = Integer.parseInt(num);
				array[n] = number;
			}
			System.out.println("The step to step with bubble sort is: \n");
			long initialBubble = System.nanoTime();
			System.out.println(b.sort(array)+"\n");
			long finalBubble = System.nanoTime();
			long bubbleTime = initialBubble - finalBubble;
			System.out.println("The time in nano seconds that the bubble sort method takes is: "+bubbleTime);
			System.out.println("The step to step with insertion sort is: ");
			long initialInsertion = System.nanoTime();
			System.out.println(i.sort(array)+"\n");
			long finalInsertion = System.nanoTime();
			long insertionTime = initialInsertion - finalInsertion;
			System.out.println("The time in nano seconds that the insertion sort method takes is: "+insertionTime);
			System.out.println("The step to step with bubble sort is: ");
			long initialSelection = System.nanoTime();
			System.out.println(s.sort(array)+"\n");
			long finalSelection = System.nanoTime();
			long selectionTime = initialSelection - finalSelection;
			System.out.println("The time in nano seconds that the selection sort method takes is: "+selectionTime);
			
		}
	}
}
