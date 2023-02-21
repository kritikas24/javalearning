class BubbleSort {
	public static void main(String[] s) {
		int[] a = {35,10,31,11,26};
		
		BubbleSort b = new BubbleSort();
		b.sorting(a);
	}
	
	public void sorting(int[] arr) {
		int temp = 0;
		for (int i=0; i< arr.length; i++) {
			for (int j=i+1; j< arr.length; j++) {
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					temp = 0;
				}
			}
		}
		
		for (int i=0; i< arr.length; i++) {
			System.out.print(arr[i]);
		}
	}

}


