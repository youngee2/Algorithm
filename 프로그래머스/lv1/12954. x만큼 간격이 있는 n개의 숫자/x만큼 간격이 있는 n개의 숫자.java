class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long s=x;
        for(int i=0; i<answer.length; i++){
            answer[i] = s;
            s+=x;    
        }
        return answer;
    }
}