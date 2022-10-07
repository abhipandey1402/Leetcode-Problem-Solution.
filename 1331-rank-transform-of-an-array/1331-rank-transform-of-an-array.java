class Solution {
    public int[] arrayRankTransform(int[] arr) {
       int val[] = arr.clone();
        Arrays.sort(val);
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
        for(int i : val) 
        {
         if(!map.containsKey(i)){
             map.put(i, map.size()+1);
         }
        }
        for(int i=0; i<arr.length; i++){
            arr[i] = map.get(arr[i]);
        }
        return arr;
    }
}