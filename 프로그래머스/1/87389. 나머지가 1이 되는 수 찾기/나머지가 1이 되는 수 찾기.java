class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int i=1; i<=n; i++){ //1부터 n까지 1씩 증가하며 반복
            if(n%i==1){ //n을 i로 나눈 나머지가 1이면
                answer=i; //answer에 i 대입
                break; //반복문 빠져 나감
            }
        }
        return answer; 
    }
}