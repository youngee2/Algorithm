import java.util.*;
class Solution {
    public  int[] solution(int[] arr) {
        if(arr.length==1)  return new int[]{-1}; //입력받은 배열의 길이가 1인 경우엔 -1
        
        int min=arr[0]; //배열 arr[1]부터 하나씩 비교 
        for(int i=1; i<arr.length; i++){
            min=min>arr[i]?arr[i]:min; //min과 배열 값 비교
        }
        
        int[] answer = new int[arr.length-1]; //가장 작은 수를 제거한 배열을 리턴해야해서 배열 길이에서 -1
        int index=0;
        for(int i=0; i<arr.length; i++){ //배열 길이만큼 반복하면서
            if(min!=arr[i]) answer[index++]=arr[i]; 
            //가장 작은 수를 가지고 있는 min 변수와 배열의 값이 같지 않으면 answer 배열에 채움.
        }
        return answer;
    }
}
    
