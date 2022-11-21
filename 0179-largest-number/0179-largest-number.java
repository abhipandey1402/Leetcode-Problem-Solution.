class Solution {
    public String largestNumber(int[] nums) {
        
        String str[] = new String[nums.length];
        for(int i=0; i<nums.length; i++){
            str[i] = nums[i] + "";
        }
     
        Arrays.sort(str, new Comparator<String>(){
            public int compare(String x, String y){
                String xy = x+y;
                String yx = y+x;
                return yx.compareTo(xy);
            }
        });
        StringBuffer sb = new StringBuffer("");
        for(String x : str){
            sb.append(x);
        }
        if(sb.charAt(0) == '0'){
            return "0";
        }
        return sb.toString();
    }
}