class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
      HashSet<Integer> seen = new HashSet<>();
        HashMap<Integer, Integer> lossesCount = new HashMap<>();
        
        for(int[] match : matches){
            int winner = match[0];
            int loser = match[1];
            
            seen.add(winner);
            seen.add(loser);
            lossesCount.put(loser, lossesCount.getOrDefault(loser, 0)+1);
        }
        
         List<List<Integer>> answer = Arrays.asList(new ArrayList<>(), new ArrayList<>());
        
        for(int player : seen){
            if(!lossesCount.containsKey(player)){
                answer.get(0).add(player);
            }
            else if(lossesCount.get(player) == 1){
                answer.get(1).add(player);
            }
        }
        Collections.sort(answer.get(0));
        Collections.sort(answer.get(1));
        
        return answer;
    }
}