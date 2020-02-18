package sorting;
import java.util.Scanner;
public class BubbleSort{
	
	private static Scanner sc;

	public static void main(String[] args){
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
			for (int i = array.length; i > 0; i-- ) {
				for (int j = 0; j < i - 1; j++ ) {
					if (array[ j ] > array[ j + 1 ]) {
						System.out.println(showArray(array));
						int aux = array[ j ];
						array[ j ] = array[ j + 1 ];
						array[ j + 1 ] = aux;
					}
				}
			}
			System.out.println("The sorted array is :\n"+showArray(array));
		}		
	}
	
	public static String showArray(int[] array) {
		String msg = "";
		for (int i = 0; i < array.length; i++) {
			msg += array[i];
			if (i != array.length -1) {
				msg += " ";
			}
		}
		return msg;
	}
}
