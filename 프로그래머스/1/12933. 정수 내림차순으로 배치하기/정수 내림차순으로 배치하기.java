import java.util.*;
class Solution {
    public long solution(long n) {
        /*
        String str = Long.toString(n); 
        String [] arr = new String[str.length()];
        
        for(int i=0; i<str.length();i++){
            arr[i]=""+str.charAt(i);
        }
        
        Arrays.sort(arr,Collections.reverseOrder());
        
        String a = "";
        for(int i=0; i<str.length(); i++){
            a+=arr[i];
        }
        n = Long.parseLong(a);
        return n;
    */
        
        char[] arr=Long.toString(n).toCharArray(); //long타입을 String타입으로 변환 후 char타입으로 배열에 저장
        Arrays.sort(arr); //	112378
        
        StringBuilder sb = new StringBuilder(new String(arr));
        sb.reverse(); //873211

        long answer=Long.parseLong(sb.toString()); 
        return answer;
    }
}