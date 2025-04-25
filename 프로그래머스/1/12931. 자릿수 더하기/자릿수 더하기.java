public class Solution {
    public int solution(int n) {
       // String answer =Integer.toString(n); //문자열로 변환
        String answer = n+""; //문자열로 변환
        int sum=0;
        for(int i=0; i<answer.length(); i++){ //문자열 길이만큼 반복
            sum+=answer.charAt(i)-'0'; //문자열에서 하나씩 숫자로 변경 후 sum과 더함. 
            //ex) 아스키코드로 변환 후 빼는 식. 만약 answer.charAt(i)가 '8'이라면 
            // sum+='8'-'0'; 
            //8의 아스키코드는 56 0의 아스키코드는 48
            // sum+= 56-48= 8
            //char 타입은 내부에선 유니코드로 저장됨.(묵시적 형변환) String은 객체라서 연산 불가.
        }
        return sum;
    }
 }