import java.util.*;
class Solution {
    public int[] solution(long n) {
        String str=Long.toString(n); //자연수 n을 문자열로 변환
        int[] answer = new int[str.length()];

        for(int i=0; i<answer.length; i++){ //배열 길이만큼 돌면서 
        answer[i]=str.charAt(answer.length-1-i)-'0'; 
            //뒤에서 하나씩 배열에 저장.
            //뒤에 '0'을 빼는 이유는 문자형 숫자를 정수로 바꾸기 위해.
            //answer.length-1은 배열 마지막 요소를 뜻함. 거기서 i씩 더 빼면 뒤에서부터 앞으로 
        }
        return answer;
    }
}