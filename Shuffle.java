class Shuffle {
   /* public int[] shuffle(int[] nums, int n) {
		int k=0;
        int response[] = new int[nums.length];
            for (int i = 0; i<n; i++) {
				for (int j=i; j<nums.length; j+=n) {
				System.out.println("j value : " + j);
                response[k]  = nums[j];
				k++;
            }
                              }
        
        return response;
    }*/
	
	public static void main(String[] args){
		int[] nums = {1,2,3,4,4,3,2,1};
		Shuffle s = new Shuffle();
		int[] val = s.shuffle(nums, 4);
		
		for (int i =0; i< val.length; i++) {
			System.out.print(val[i]);
		}
	}
	
	   public int[] shuffle(int[] nums, int n) {
        int response[] = new int[2*n];
				 for (int i = 0; i < n; i++)
					{
						response[2*i] = nums[i];
						response[(2*i) + 1] = nums[i + n];
					}

				
           
        return response;
    }
}





/*1,1,2,3,4,8
0,1,2,3,4,5

2

1,2,4,1,3,8
0,2,4,1,3,5*/