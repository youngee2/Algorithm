class Solution {
    public int solution(String my_string) {
        String answer = my_string.replaceAll("[^0-9]","");
        int sum=0;
        for(int i=0; i<answer.length(); i++){
            sum+=(answer.charAt(i)-'0');
        }
        return sum;
    }
}