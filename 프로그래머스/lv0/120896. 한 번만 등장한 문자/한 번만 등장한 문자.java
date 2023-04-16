class Solution {
    public String solution(String s) {
        String answer="";
        int[] arr = new int[26];
        int a = 0;
        for(int i=0; i<s.length(); i++){
            a=s.charAt(i)-97;
            arr[a]++;
        }
        
        for(int i=0; i<arr.length; i++){
            if(arr[i]==1){
                 answer+=((char)(i+97));
            }  
        }

        return answer;
    }
}