class Solution {
    public long solution(int a, int b) {
		int max = Math.max(a, b); //두 정수 중 큰 값 
		int min = Math.min(a, b); //두 정수 중 작은 값
		long sum=0;
        for(int i=min; i<=max; i++){
            sum+=i;
        }
		return sum;
    }
}