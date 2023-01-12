import java.util.*;
class Solution {
    public int solution(int n) {
        double m = Math.sqrt(n);
        int answer = (int)m*(int)m==n ? 1 : 2; 
        return answer;
    }
}