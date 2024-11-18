import java.util.*;
class Solution {
    public int maxProduct(int[] nums) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        for(int i:nums){
            queue.offer(i);
        }

        return (queue.poll()-1)*(queue.poll()-1);

        
    }
}