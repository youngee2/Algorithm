class Solution {
    public int[] solution(int[] array) {
        int[] arr = new int[2];
        int max=0,index=0;;
        for(int i=0; i<array.length; i++){
            if(max<array[i]){
                max=array[i];
                index=i;
            }
        }
        arr[0]=max; arr[1]=index;
        return arr;
    }
}