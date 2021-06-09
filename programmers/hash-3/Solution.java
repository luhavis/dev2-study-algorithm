import java.util.*;

/** 경우의 수 구하는 문제
 * 옷의 종류를 키로 가지고, 옷 종류가 같으면 +1
 * keySet으로 for 문 돌려서 +1을 한 값을 곱해 준다. (각 종류의 옷을 선택하거나 선택하지 않을 수 있으니 +1)
 * 마지막 값에서 -1을 해준다. (아무것도 선택하지 않을 경우가 있으니 -1)
 */
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