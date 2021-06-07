
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

import java.util.*;

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