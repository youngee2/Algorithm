class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n]; 
        for(int i=0; i<answer.length; i++){ //배열 길이만큼 반복
            answer[i] = (long)x*(i+1); //x*1=2 x*2=4 x*3=6  ... long타입으로 변환해줘야 100점으로 채점 
        }
        return answer;
    }
}