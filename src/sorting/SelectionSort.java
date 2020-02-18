package sorting;

public class SelectionSort extends Sort {

	@Override
	public String sort(int[] array) {
		String msg = "";
		msg += showArray(array);
		for (int i = 0; i < array.length - 1; i++) {
			int smallest = array[ i ];
			int position = i;
			for (int j = i + 1; j < array.length; j++) {
				if (array[ j ] < smallest) {
					smallest = array[ j ];
					position = j;
				}
			}
			int aux = array[ i ];
			array[ i ] = smallest;
			array[ position ] = aux;
			msg += showArray(array);
		}
		msg += "\nThe sorted array by selection sort is : "+showArray(array);
		return msg;
	}

	/**
	 * 
	 */
	public SelectionSort() {
		super();
		// TODO Auto-generated constructor stub
	}

}
