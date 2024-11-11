import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
     Stack<Integer> answer = new Stack<>();
     
        answer.push(arr[0]);
        for(int i=1; i<arr.length; i++){
            if(answer.peek()!=arr[i]){
                answer.push(arr[i]);
            }
        }
        
        int[] list = new int[answer.size()];
        Collections.reverse(answer);
        for(int i=0;i<list.length; i++){
            list[i]=answer.pop();
        }
        return list;
 
    }
}