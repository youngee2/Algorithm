import java.util.*;
class Solution {
    public ArrayList<Integer> solution(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        Integer min=0;
        for(int i=0; i<arr.length; i++){
            list.add(arr[i]);        
        }
        min=Collections.min(list);
        if(list.size()>1){
            list.remove(min);
        }else{
            list.set(0,-1);
        }
        return list;
    }
}