import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
     Queue<Integer> list = new LinkedList<>();
        
        int last = arr[0];
        list.offer(last);
        
        for(int i=1; i<arr.length; i++){
            if(last!=arr[i]){
                last=arr[i];
                list.offer(last);
            }
        }
        
        int[] answer = new int[list.size()];
        
        for(int i=0; i<answer.length; i++){
            answer[i]=list.poll();
        }
        return answer;
    }
}