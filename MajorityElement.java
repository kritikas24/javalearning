
//https://leetcode.com/problems/majority-element/
public class MajorityElement {
	    public int majorityElement(int[] nums) {
	        int candidate = 0, count = 0;
	        for (int num : nums) {
	            if (count == 0) {
	                candidate = num;
	            }
	            count += (num == candidate) ? 1 : -1;
	        }
	        return candidate;
	}
	    
	   public static void main (String[] s) {
		   int[] input = {2,2,1,1,1,2,2};

		   MajorityElement element = new MajorityElement();
		   int response = element.majorityElement(input);
		   System.out.println(response);
		   
		   int[] input1 = {2,1,1,1,1,1,2};

		   response = element.majorityElement(input1);
		   System.out.print(response);
	   }
}
