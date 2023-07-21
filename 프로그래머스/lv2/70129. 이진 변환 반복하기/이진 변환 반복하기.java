class Solution {
    public int[] solution(String s) {
        int[] answer = new int[2];
		while (!s.equals("1")) {
			// 1. 수에서 0을 제외. 나중에 카운트하여 출력.
			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == '0') {
					answer[1]++; //제거할 0의 수 카운트.
				}
			}
			// 2. 0을 제외한 길이.
			s = s.replaceAll("0", "");
			// 3. 길이를 2진수로 변환. 1이 아닐경우 1번부터 시작.
			s = Integer.toBinaryString(s.length());
			answer[0]++; //이진 변환 횟수 카운트.
		}
        return answer; //[이진 변환 횟수, 제거할 0의 수]
    }
}