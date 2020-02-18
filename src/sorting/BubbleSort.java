package sorting;
public class BubbleSort{
	
	public String sort(int[] array) {
		String msg = "";
		for (int i = array.length; i > 0; i-- ) {
			for (int j = 0; j < i - 1; j++ ) {
				if (array[ j ] > array[ j + 1 ]) {
					msg += showArray(array);
					int aux = array[ j ];
					array[ j ] = array[ j + 1 ];
					array[ j + 1 ] = aux;
				}
			}
		}
		msg +="\nThe sorted array is : "+showArray(array);
		return msg;
	}		
	
	
	public static String showArray(int[] array) {
		String msg = "";
		msg += "[";
		for (int i = 0; i < array.length; i++) {
			msg += array[i];
			if (i != array.length -1) {
				msg += " ";
			} else {
				msg += "]";
			}
		}
		return msg;
	}
}
