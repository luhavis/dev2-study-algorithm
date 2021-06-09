import java.util.*;

/**
 * 비교 후 완주 한 선수가 있으면 하나씩 제거해서 남은 선수를 출력
 *
 */
class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        
        for (int i=0; i<participant.length; i++) {            
            for (int j=0; j<completion.length; j++) {
                if (participant[i].equals(completion[j])) {
                    completion[j] = null;
                    participant[i] = null;
                    break;
                }
            }
            
            if (participant[i] != null) {
                return participant[i];
            }
            
        }        
        
        return answer;
    }
}


// hashmap 사용
/**
 * 이름을 키로 잡고 값을 1로 넣고, 동명이인이 있을 수 있으니 +1로 처리
 * for 문을 돌려 완주한 선수가 있으면 -1, 마지막에 0이 아닌 참가자를 출력
 */


class Solution {
    public String solution(String[] participant, String[] completion) {
        String answer = "";
        
        HashMap<String, Integer> h = new HashMap<String, Integer>();
        
        
        for (String i : participant) {
            h.put(i, h.get(i) == null ? 1 : h.get(i) + 1);
        }
        
        for (String j : completion) {
            h.put(j, h.get(j) - 1);            
        }
        
        for (String key : h.keySet()) {
            if (h.get(key) != 0) {
                answer = key;
            }
        }      
        
        
        return answer;
    }
}