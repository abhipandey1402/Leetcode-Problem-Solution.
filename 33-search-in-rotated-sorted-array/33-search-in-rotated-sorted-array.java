class Solution {
    public int search(int[] nums, int target) {
        if(nums==null || nums.length==0) return -1;
        int l=0, r=nums.length-1;
       // find out the index of the smallest element.
        while(l<r){
            int mid = (l+r)/2;
            if(nums[mid] > nums[r]){
                l = mid+1;
            }else{
                r = mid;
            }
        }
        
       // since we now know the start, find out if the target is to left or right of start in the array.
        int min = l;
        l = 0; r = nums.length-1;
        if(target >= nums[min] && target <= nums[r]){
            l = min;
        }else{
            r = min;
        }
        // the regular search.
        while(l<=r){
            int mid = (l+r)/2;
            if(nums[mid]==target) return mid;
            else if(nums[mid] > target) r = mid-1;
            else l=mid+1;
        }
        
        return -1;
    }
}