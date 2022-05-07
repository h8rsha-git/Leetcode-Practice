/*
35. Search Insert Position

Given a sorted array of distinct integers and a target value, return the index if the target is found. 
If not, return the index where it would be if it were inserted in order.
You must write an algorithm with O(log n) runtime complexity.
*/

//Also notice that the input target might be larger than all elements in nums 
//and therefore needs to placed at the end of the array.

public class searchIndexPosition{
    public int searchInsert(int[] nums, int target) {
        int low = 0, high = nums.length;
        while(low < high){
            int mid = low + (high - low)/2;
            if(nums[mid] >= target){
                high = mid;
            }
            else{
                low = mid + 1;
            }
        }
        return low;
    }
}