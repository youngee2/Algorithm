class Solution {
    public int solution(String s) {
        String[] arr = s.split("\\s");
        int sum=0;
        for(int i=0; i<arr.length; i++){
            if(!arr[i].equals("Z")){
                sum+=Integer.parseInt(arr[i]);
            }else{
                sum-=Integer.parseInt(arr[i-1]);
            }
        }
        return sum;
    }
}