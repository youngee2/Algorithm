class Solution {
    public int solution(int[] numbers) {
        int answer=0,count=0;
        for(int j:numbers){
            answer+=j;
        }
        return 45-answer;
    }
}