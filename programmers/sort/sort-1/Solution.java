import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {

        // 결과값을 담고있을 리스트
        List<Integer> result = new ArrayList<Integer>();

        // 배열 자르고 정렬하고 담을 변수
        List<Integer> a = null;
        
        
        for (int i=0, length=commands.length; i<length; i++) {
            a = new ArrayList<Integer>();
            
            for (int j=commands[i][0], k=commands[i][1]; j<=k; j++) {                  
                a.add(array[j-1]);
            }
            
            a.sort(Comparator.naturalOrder());
            result.add(a.get(commands[i][2]-1));
        }
                
        
//         for (int i=command1[0]; i<=command1[1]; i++) {
//             a.add(array[i-1]);
//         }        
        
        
//         List<Integer> b = new ArrayList<Integer>();
//         for (int i=command2[0]; i<=command2[1]; i++) {
//             b.add(array[i-1]);
//         }
        
//         List<Integer> c = new ArrayList<Integer>();
//         for (int i=command3[0]; i<=command3[1]; i++) {
//             c.add(array[i-1]);
//         }        
        
        
        
//         result.add(a.get(command1[2]-1));
//         result.add(b.get(command2[2]-1));
//         result.add(c.get(command3[2]-1));
        
        int[] answer = new int[result.size()];
        
        int size = 0;
        for (int num : result) {
            answer[size++] = num;    
        }
        
        return answer;
    }
}