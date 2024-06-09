import java.util.*;

class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashSet<Integer> pokemon = new HashSet<>();
        
        for(int x:nums){
            pokemon.add(x);
        }
        
        if((nums.length/2)<pokemon.size()){
            answer=nums.length/2;
        }else{
            answer=pokemon.size();
        }

        return answer;
    }
}