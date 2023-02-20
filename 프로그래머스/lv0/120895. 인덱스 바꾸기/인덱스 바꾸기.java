class Solution {
    public String solution(String my_string, int num1, int num2) {
        char temp;
        char[] str = my_string.toCharArray();
        
        temp=str[num1];
        str[num1]=str[num2];
        str[num2]=temp;
        
        String answer= new String(str);
        return answer;
    }
}