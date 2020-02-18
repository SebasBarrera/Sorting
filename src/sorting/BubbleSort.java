package sorting;
public class BubbleSort extends Sort{
	
	/**
	 * 
	 */
	public BubbleSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String sort(int[] array) {
		String msg = "";
		msg += showArray(array);
		for (int i = array.length; i > 0; i-- ) {
			for (int j = 0; j < i - 1; j++ ) {
				if (array[ j ] > array[ j + 1 ]) {
					int aux = array[ j ];
					array[ j ] = array[ j + 1 ];
					array[ j + 1 ] = aux;
					msg += showArray(array);
				}
			}
		}
		msg += "\nThe sorted array bu bubble sort is : "+showArray(array);
		return msg;
	}		
	
	
	
}
