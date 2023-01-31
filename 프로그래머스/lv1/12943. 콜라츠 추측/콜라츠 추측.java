class Solution {
    public int solution(int num) {
        int answer = 0;
        long n = num;
        
        if(n==1) answer= 0;
        
        while(n!=1){
            if(n%2==0){
                n/=2;
                answer++;
            }else if(n%2!=0){
                n=n*3+1;
                answer++;
            }  
        }
        if(answer>=500)answer=-1;
        
        
       
        return answer;
    }
}