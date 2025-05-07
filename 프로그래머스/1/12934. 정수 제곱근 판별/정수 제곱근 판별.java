class Solution {
    public long solution(long n) {
        long answer=-1; //처음부터 -1 
        
        for(long i=1; i<=n; i++){
            if(i*i==n){ //i*i 제곱이 n이라면
                answer=(i+1)*(i+1); //x+1의 제곱 
                break;
            }
        }
        return answer;
    }
}