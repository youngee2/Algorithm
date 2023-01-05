class Solution {
    public int[] solution(int n) {
        int[] answer = new int[n%2==1?(n/2)+1:(n/2)] ;
        int[] result = new int[answer.length];
        for(int i=n, j=0; i>0; i--){  
            if(i%2==1){
            answer[j] = i;
            j++; 
          }
        }
        for(int i=0,j=answer.length-1; j>=0; j--,i++){
            result[i]=answer[j];
        }
    return result;
    }
}