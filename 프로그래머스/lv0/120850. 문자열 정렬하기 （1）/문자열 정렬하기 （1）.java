import java.util.*;
class Solution {
    public int[] solution(String my_string) {
        String str = my_string.replaceAll("[^0-9]","");
        int[] arr = new int[str.length()];
        for(int i=0; i<arr.length; i++){
            arr[i]=str.charAt(i)-'0';
        }
        Arrays.sort(arr);
        return arr;
    }
}