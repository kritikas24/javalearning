/*A conveyor belt has packages that must be shipped from one port to another within days days.
The ith package on the conveyor belt has a weight of weights[i]. Each day, we load the ship with packages on the conveyor belt (in the order given by weights). We may not load more weight than the maximum weight capacity of the ship.
Return the least weight capacity of the ship that will result in all the packages on the conveyor belt being shipped within days days.
Input: weights = [3,2,2,4,1,4], days = 3
Output: 6
Explanation: A ship capacity of 6 is the minimum to ship all the packages in 3 days like this:
1st day: 3, 2
2nd day: 2, 4
3rd day: 1, 4
https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/description/
*/

class PackageCapaciy {
    public int shipWithinDays(int[] weights, int days) {
        int ans = 0;
        
        int l = 0;
        int r = Integer.MAX_VALUE;
        
        while(l<=r){
            int mid = l + (r-l)/2;
            if(possible(weights,mid,days)){
                ans = mid;
                r = mid-1;
            }else{
                l = mid+1;
            }
        }
        return ans;
    }
    
    static boolean possible(int[] arr, int mid, int days){
        int n = arr.length;
        int weight = 0;
        int day = 1;
        
        for(int i = 0; i<n; i++){
            if(arr[i] > mid)
                return false;
            
            weight+=arr[i];
            if(weight>mid){
                day++;
                weight = arr[i];
            }
            
            if(day>days)
                return false;
        }
        
        return true;
    }
}