import java.util.*;

class Solution {
  public static int solution(String[][] clothes) {
    int answer = 1;
        
    HashMap<String, Integer> h = new HashMap<String, Integer>();
    
    for (String[] s : clothes) {
      h.put(s[1], h.get(s[1]) == null ? 1 : h.get(s[1]) + 1);
    }

    for (String key : h.keySet()) {
      answer *= (h.get(key) + 1);
    }
    
    System.out.println(answer);
    return answer - 1;
  }

  public static void main(String[] args) {
    String[][] params = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};

    solution(params);
  }
}