public class InsertionSort {
	public static void main (String[] s) {
		int[] arr = {5,2,9,1,5,6,3};
		insertionSort(arr);
		
		System.out.print("Sorted array: ");
		for (int i : arr) {
			System.out.print(i + " ");
		}
	}
	
	public static int[] insertionSort(int[] arr) {
		int key = arr[1];
		
		for (int i = 1; i < arr.length; i++) {
			key = arr[i];
			int j = i - 1;
			while (j >= 0 && arr[j] > key) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = key;
		}
		return arr;
		
	}
}
