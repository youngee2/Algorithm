import java.util.*;
class Solution{
    public int solution(int []A, int []B){
        
        //int[] -> Integer[]
        Integer[] DESC = new Integer[B.length];
        for (int i = 0; i < B.length; i++) {
            DESC[i] = B[i];
        }

        
        //A 오름차순
        Arrays.sort(A);
        
        //B 내림차순
        Arrays.sort(DESC, Collections.reverseOrder());
        
        int answer = 0;
        
        for(int i=0; i<A.length; i++){
            answer+=A[i]*DESC[i];    
        }
        
        return answer;
    }
}