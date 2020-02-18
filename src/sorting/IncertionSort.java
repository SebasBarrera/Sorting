package sorting;

public class IncertionSort extends Sort {

	@Override
	public String sort(int[] array) {
		String msg = "";
		msg += showArray(array);
		for (int i = 1; i < array.length; i++) {
			int smallest = array[i];
			int j = i-1;
			while (j>=0 && smallest > array[j]) {
				array[j + 1] = array[ j ];
				j--;
			}
			array[j + 1] = smallest;
			msg += showArray(array);
		}
		msg += "\nThe sorted array by incertion sort is : "+showArray(array);
		return msg;
	}

}
