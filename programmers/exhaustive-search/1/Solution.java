class Solution {
    public int[] solution(int[] answers) {   
                
        int[] person1 = new int[10000];        
        int[] person2 = new int[10000];
        int[] person3 = new int[10000];
        
        int person1Size = person1.length;
        for (int i=1; i<=person1Size; i++) {
            if (i % 5 == 1) {
                person1[i-1] = 1;    
            } else if (i % 5 == 2 ) {
                person1[i-1] = 2;    
            } else if (i % 5 == 3 ) {
                person1[i-1] = 3;    
            } else if (i % 5 == 4 ) {
                person1[i-1] = 4;    
            } else {
                person1[i-1] = 5;
            }
        }
        
        
        int person2Size = person2.length;
        int[] numArr = {1, 3, 4, 5};
        int numArrIndex = 0;
        for (int i=1; i<=person2Size; i++) {
            
            if (i % 2 == 1) {
                person2[i-1] = 2;
            } else {                    
                person2[i-1] = numArr[numArrIndex];
                if (numArrIndex == 3) numArrIndex = 0;
                else numArrIndex +=1;
                
            }            
        }
        
        int person3Size = person3.length;
        for (int i=1; i<=person3Size; i++) {
            int num2 = (i + 10) % 10;        
            
            if (num2 < 1 || num2 > 8) {
                person3[i-1] = 5;   
            } else if (num2 > 0 && num2 < 3) {
                person3[i-1] = 3;
            } else if (num2 > 2 && num2 < 5) {
                person3[i-1] = 1;
            } else if (num2 > 4 && num2 < 7) {
                person3[i-1] = 2;
            } else if (num2 > 6 && num2 < 9) {
                person3[i-1] = 4;
            }
        }
        
        int person1Count = 0;
        int person2Count = 0;
        int person3Count = 0;
        
        int size = answers.length;
        for (int i=0; i<size; i++) {
            if (answers[i] == person1[i]) {
                person1Count += 1;
            }
            if (answers[i] == person2[i]) {
                person2Count += 1;
            }
            if (answers[i] == person3[i]) {
                person3Count += 1;
            }               
            
        }
        
        
        int[] answer = null;
        
        if (person1Count == person2Count && person1Count == person3Count ) {
            answer = new int[]{1, 2, 3};
        } else if (person1Count > person2Count && person1Count > person3Count) {
            answer = new int[]{1};
        } else if (person2Count > person3Count && person2Count > person1Count) {
            answer = new int[]{2};
        } else if (person3Count > person1Count && person3Count > person2Count) {
            answer = new int[]{3};
        } else if (person1Count == person2Count && person1Count > person3Count) {
            answer = new int[]{1, 2};
        } else if (person1Count == person3Count && person1Count > person2Count) {
            answer = new int[]{1, 3};
        } else if (person2Count == person3Count && person2Count > person1Count) {
            answer = new int[]{2, 3};
        }
        
        
        
        return answer;
    }
}

class Solution2 {
    public int[] solution(int[] answers) {
        
        int[] person1Pattern = {1, 2, 3, 4, 5};
        int[] person2Pattern = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] person3Pattern = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
                
        int person1Count = 0;
        int person2Count = 0;
        int person3Count = 0;
        
        int person1PatternIndex = 0;
        int person2PatternIndex = 0;
        int person3PatternIndex = 0;
         
        int answersLength = answers.length;
        
        for (int i=0; i<answersLength; i++) {                       
            
            if (answers[i] == person1Pattern[person1PatternIndex]) person1Count +=1;
            if (answers[i] == person2Pattern[person2PatternIndex]) person2Count +=1;
            if (answers[i] == person3Pattern[person3PatternIndex]) person3Count +=1;
            
            if (person1PatternIndex+1 > person1Pattern.length-1) person1PatternIndex = 0;
            else person1PatternIndex +=1;
            
            if (person2PatternIndex+1 > person2Pattern.length-1) person2PatternIndex = 0;
            else person2PatternIndex +=1;
            
            if (person3PatternIndex+1 > person3Pattern.length-1) person3PatternIndex = 0;
            else person3PatternIndex +=1;            
        }
        
        
        int[] answer = null;
        
        if (person1Count == person2Count && person1Count == person3Count ) {
            answer = new int[]{1, 2, 3};
        } else if (person1Count > person2Count && person1Count > person3Count) {
            answer = new int[]{1};
        } else if (person2Count > person3Count && person2Count > person1Count) {
            answer = new int[]{2};
        } else if (person3Count > person1Count && person3Count > person2Count) {
            answer = new int[]{3};
        } else if (person1Count == person2Count && person1Count > person3Count) {
            answer = new int[]{1, 2};
        } else if (person1Count == person3Count && person1Count > person2Count) {
            answer = new int[]{1, 3};
        } else if (person2Count == person3Count && person2Count > person1Count) {
            answer = new int[]{2, 3};
        }
        
        
        
        
        return answer;
    }
}