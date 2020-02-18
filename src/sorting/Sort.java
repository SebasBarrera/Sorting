package sorting;

public abstract class Sort {
	
	public abstract String sort(int[] array);
	
	public static String showArray(int[] array) {
		String msg = "";
		msg += "[";
		for (int i = 0; i < array.length; i++) {
			msg += array[i];
			if (i != array.length -1) {
				msg += " ";
			} else {
				int j = i + 1;
				msg += "]\n"+j+"steps takeds";
			}
		}
		return msg;
	}
}
