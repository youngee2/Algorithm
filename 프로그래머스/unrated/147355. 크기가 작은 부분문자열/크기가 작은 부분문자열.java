import java.util.ArrayList;

class Solution {
    public int solution(String t, String p) {
		ArrayList<String> list = new ArrayList<>();
		int answer = 0;
		while (t.length() >= p.length()) {
			list.add(t.substring(0, p.length())); // 처음부터 p길이만큼 list에 저장
			t = t.substring(1); // 기존 t에 자르고 남은 문자열을 저장
		}
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).compareTo(p) <= 0) { // p보다 작거나 같은 수 카운트
				answer++;
			}
		}
        return answer;
    }
}
