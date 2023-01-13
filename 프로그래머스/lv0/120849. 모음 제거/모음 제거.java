class Solution {
    public String solution(String my_string) {
        String empty ="", answer="";
        String arr[] = {"a","e","i","o","u"};
        for(int i=0; i<5; i++){
             answer = my_string.replaceAll(arr[i],empty);
            my_string=answer;
        }
        return answer;
    }
}