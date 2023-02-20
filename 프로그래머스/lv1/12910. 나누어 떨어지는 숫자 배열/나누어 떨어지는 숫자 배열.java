import java.util.*;
class Solution {
    public List<Integer> solution(int[] arr, int divisor) {
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=0; i<arr.length; i++){
            if(arr[i]%divisor==0){
                list.add(arr[i]);
            }
        }
        Collections.sort(list);
        if(list.size()==0){
            list.add(-1);
        }
        
        return list;
    }
}