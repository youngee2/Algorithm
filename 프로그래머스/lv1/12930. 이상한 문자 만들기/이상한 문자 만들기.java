class Solution {
    public String solution(String s) {
        String answer = "";
        int count=0;
        String[] list = s.split(""); 
        //한 글자씩 나누어 배열에 저장
        for(String str:list){//for-each 루프를 사용하여 한 글자씩 처리
            count=str.contains(" ")?0:count+1; 
            //만약 한 글자가 공백이라면 0으로 카운트를 하지 않고, 공백이 아니라면 count+1해주어 짝/홀 인덱스를 판단할 수 있게 해준다. (공백제외 문자를 대소문자 변환해야 해서)
            answer+=count%2!=0? str.toUpperCase(): str.toLowerCase();
            //count가 홀수라면 한 글자를 대문자로, 짝수라면 한 글자를 소문자로 변환한다.
        }
        return answer;
    }
}