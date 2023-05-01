class Solution {
    public String solution(String my_string, int n) {
        StringBuilder sb = new StringBuilder();
        for(int i=my_string.length(); i>my_string.length()-n; i--){
            sb.append(my_string.charAt(i-1));
        }
        return sb.reverse().toString();
    }
}