class Solution {
    public boolean solution(int x) {
        boolean answer = true;
        String str = Integer.toString(x);
        int sum=0;
        for(int i=0; i<str.length(); i++){
            sum+=(int)(str.charAt(i)-'0');
        }
        if(x%sum!=0){
            answer=false;
        }
        return answer;
    }
}