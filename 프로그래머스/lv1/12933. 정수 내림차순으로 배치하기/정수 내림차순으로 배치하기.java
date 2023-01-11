import java.util.*;
class Solution {
    public long solution(long n) {
        String str = ""+n;
        String[] arr = new String[str.length()];
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
    }
}