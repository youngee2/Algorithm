class Solution {
    public int solution(int num, int k) {
        String a = Integer.toString(num);
        int answer = a.indexOf(Integer.toString(k))+1;
        if(answer==0){
           return answer=-1;
        }
        return answer;
    }
}