import java.util.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = 0;
        
        
        answer = n - lost.length;        
        
        // 우선 정렬
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        List<Integer> lostList = new ArrayList<>();
        for (int i : lost) lostList.add(i);
        
        List<Integer> reserveList = new ArrayList<>();
        for (int i : reserve) reserveList.add(i);
        
        // 우선 여벌을 가지고 있고, 도난당한 학생 제외
        for (int i=0, length2=reserve.length; i<length2; i++) {
                if (lostList.contains(reserve[i]) && reserveList.contains(reserve[i])) {
                        answer +=1;
                        reserveList.remove((Integer) reserve[i]);
                        lostList.remove((Integer) reserve[i]);
                }
        }
        
        // 도난당한 학생 중 체육복을 빌릴 수 있는지 체크
        for (int i=0, size=lostList.size(); i<size; i++) {
                if (reserveList.contains(lostList.get(i)-1)) {
                        // 다음 번호 학생
                        answer += 1;
                        reserveList.remove((Integer) (lostList.get(i)-1));
                }
                else if (reserveList.contains(lostList.get(i)+1)) {
                        // 전 번호 학생
                        answer += 1;
                        reserveList.remove((Integer) (lostList.get(i)+1));
                }
        }
        
        
        
        
        
        
        
        
        // int remainCount = 0;
        
        
//         for (int i=0, length=reserve.length; i<length; i++) {
//             boolean rent = false;
//             for (int j=0, length2=lost.length; j<length2; j++) {
                        
//                 if (rent) {
//                     break;
//                 }
                        
//                 if (lost[j] == reserve[i]) {
//                     reserve[i] = -1; // 여벌이 없는 학생
//                     answer += 1;
//                     break;
//                 } else if (lost[j] == reserve[i]-1) {
//                     lost[j] = -1;
//                     rent = true;
//                     answer += 1;
//                     break;
//                 } else if (lost[j] == reserve[i]+1) {
//                     lost[j] = -1;
//                     rent = true;
//                     answer += 1;
//                     break;
//                 }
                        
//             }
                
//             if (reserve[i] > -1) {
//                 remainCount +=1;
//             }
//         }
        
//         answer += remainCount;
        
        
        
        
        
        return answer;
    }
}

		