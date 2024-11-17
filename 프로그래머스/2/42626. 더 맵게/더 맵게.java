import java.util.*;
class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> food_list=new PriorityQueue<>();

        for(int i=0; i<scoville.length; i++){
                food_list.offer(scoville[i]);
            
        }
        
       while(food_list.peek()<K){
            if(food_list.size()>=2){
               int sum=food_list.poll()+(food_list.poll()*2);
               food_list.offer(sum);
               answer++;
           }else{
                return -1;
            }
        }
    
        
             return answer;
   
       }
    }