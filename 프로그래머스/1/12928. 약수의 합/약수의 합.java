class Solution {
    public int solution(int n) {
        
        
        int answer = 0;
        for(int i=1; i<=n; i++){ //i가 0이면 수학적으로 불가능. 그래서 1부터 n까지 반복하면서
            if(n%i==0){ //n을 i로 나눴을 때 나머지가 0이라면 약수!
                answer+=i; //약수는 모두 더한다. 기존 answer값에 n의 약수인 i를 더한다!
            }
        }
        return answer; //반복문이 끝나면 answer 리턴.
    }
}