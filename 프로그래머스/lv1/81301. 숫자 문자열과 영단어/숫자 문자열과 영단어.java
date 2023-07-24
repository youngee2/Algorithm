class Solution {
    public int solution(String s) {
        String[] arr = {"zero","one","two","three","four","five","six","seven","eight","nine"};
        for (int i = 0; i < arr.length; i++) {
			s = s.replace(arr[i], Integer.toString(i)); //s 문자열에 배열과 같은 문자열이 있다면 인덱스로 변환.
		}
		int answer = Integer.parseInt(s); //숫자를 문자로 변환
        return answer;
    }
}