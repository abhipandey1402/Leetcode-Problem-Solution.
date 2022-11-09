class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
      int n = nums.length;
      if(k == 0)
          return nums;
        
        int ans[] = new int[n-k+1];
        
        Deque<Integer> dq = new ArrayDeque<>();
        
        for(int i=0; i<n; i++){
            while(!dq.isEmpty() && dq.peek() < i-k+1){
                dq.poll();
            }
            while(!dq.isEmpty() && nums[i] >= nums[dq.peekLast()]){
                dq.pollLast();
            }
            dq.offer(i);
            
            if(i-k+1 >= 0){
                ans[i-k+1] = nums[dq.peek()];
            }
        }
        return ans;
    }
}