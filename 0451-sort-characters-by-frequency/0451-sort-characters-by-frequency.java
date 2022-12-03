class Solution {
    public String frequencySort(String s) {
      // create a map to store the frequency of each character in the string
    Map<Character, Integer> frequencyMap = new HashMap<>();
    for (char c : s.toCharArray()) {
      frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
    }

    // sort the characters by their frequency in descending order
    List<Character> sortedChars = frequencyMap.entrySet()
      .stream().sorted((a, b) -> b.getValue() - a.getValue()).map(Map.Entry::getKey).collect(Collectors.toList());

    // build and return the sorted string
    StringBuilder sb = new StringBuilder();
    for (char c : sortedChars) {
      for (int i = 0; i < frequencyMap.get(c); i++) {
        sb.append(c);
      }
    }
    return sb.toString();  
    }
}