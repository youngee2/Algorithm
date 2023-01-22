public class Solution {
    public int solution(int n) {
        String answer =Integer.toString(n);
        int sum=0;
        for(int i=0; i<answer.length(); i++){
            sum+=answer.charAt(i)-'0';        
        }
        return sum;
    }
 }
