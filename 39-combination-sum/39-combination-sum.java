class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
      // Arrays.sort(candidates);
       List<List<Integer>> res = new ArrayList<>();
        List<Integer> ele = new ArrayList<>(); 
        combineSum(candidates, target, res, 0, ele);
        return res;
    }
    
    public static void combineSum(int[] nums, int target, List<List<Integer>> res, int index, List<Integer> ele){
        
        if(target == 0){
            res.add(new ArrayList<>(ele));
            return;
        }
        if(index == nums.length){
            return;
        }
        if(nums[index]<=target){
            ele.add(nums[index]);
            combineSum(nums, target - nums[index], res, index, ele);
            ele.remove(ele.size() - 1);
        }
        combineSum(nums, target, res, index + 1, ele);
    }
}