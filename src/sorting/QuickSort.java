package sorting;

public class QuickSort extends Sort {

	@Override
	public String sort(int[] array) {
		String msg = "";
		int right = array.length;
		int left = 0;
		msg = quickSort(array, left, right);
		return msg;
		
	}

	public String quickSort(int[] array, int left, int right) {
		String msg = "";
		int pivot = array[left]; 
	    int i = left; 
		int j = right;
		while(i<j){            
			while(array[i]<=pivot && i<j) i++; 
			while(array[j]>pivot) j--;         
			if (i<j) {                                   
				int aux= array[i];                  
		        array[i]=array[j];
		        array[j]=aux;
		     }
		}
		array[left]=array[j]; 
	    array[j]=pivot; 
	    msg += showArray(array);
	    if (verify(array)) {
	    	return msg;
		}
	    if(left<j-1)
	         quickSort(array,left,j-1); 
	    if(j+1 <right)
	        quickSort(array,j+1,right);
		return msg;
	   }

	/**
	 * 
	 */
	public QuickSort() {
		super();
		// TODO Auto-generated constructor stub
	}

	private boolean verify(int[] array) {
		boolean sort = false;
		int i;
		do {
			for ( i=0; i<array.length-1; i++) {
				if (array[1] > array[i+1])
					sort =false;
				if (array[1] < array[i+1])
					sort = true;
			}
		} while (i< array.length-1);
		return sort;
	}

}
