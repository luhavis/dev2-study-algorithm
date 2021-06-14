import java.util.*;

/** 
 * 앞 뒤 배열에 있는 전화번호로 시작되는 값인지 체크 후 true, false 리턴
 */
class Solution_1 {
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        int size = phone_book.length;
        for (int i=0; i<size-1; i++) {
            for (int j=i+1; j<size; j++) {
                if (phone_book[j].startsWith(phone_book[i])) return false;
                if (phone_book[i].startsWith(phone_book[j])) return false;
            }
        }
        return answer;
    }
}


/** 
 * HashMap에 전화번호를 담고 for 문을 돌려 전화번호 배열에 있는 전화번로로 시작하는지 체크
 */
class Solution {
  public static boolean solution(String[] phone_book) {
      boolean answer = true;
      
      HashMap<String, String> h = new HashMap<String, String>();      
      
      for (String s : phone_book) {
          h.put(s, s);
      }
      
      int mapSize = h.size();
      for (int i=0; i<mapSize; i++) {
        for (int j=0; j<phone_book[i].length(); j++) {
          System.out.println(phone_book[i].substring(0,j));
          if (h.containsKey(phone_book[i].substring(0,j))) return false;
        }                    
      }
      
      return answer;
  }

  public static void main(String[] args) {
    String[] params1 = new String[]{"119", "97674223", "1195524421"};
    solution(params1);

    String[] params2 = new String[]{"123","456","789"};
    solution(params2);

    String[] params3 = new String[]{"12","123","1235","567","88"};
    solution(params3);
  }
}