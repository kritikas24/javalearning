public class QuickSort {
	public static void main(String[] s) {
		int[] arr = { 13, 18, 27, 2, 19, 25 }; 
			
		QuickSort q = new QuickSort();
		q.quickSort(arr, 0, arr.length-1);
		
		for (int i =0; i< arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void quickSort(int[] arr, int start, int end) {
		if (start<end) {
			int p = partition(arr, start, end);
			quickSort(arr, start, p-1);
			quickSort(arr, p+1, end);
		}
		
	}
	
	int partition(int arr[], int start, int end) {
		int pivot = arr[end];
		int i = start-1;
		
		
		for (int j= start; j< end-1; j++) {
			if (arr[j] < pivot ) {
				i++;
				int t = arr[i];  
				arr[i] = arr[j];  
				arr[j] = t;  
			}
		}
		
		int t = arr[i+1];  
		arr[i+1] = arr[end];  
		arr[end] = t;  
		return (i + 1);  
	}
}

