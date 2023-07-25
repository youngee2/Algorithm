import java.util.*;
class Solution {
    public String solution(String s) {
  		boolean FirstWord = true;

		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ' ') {
				sb.append(" "); // 문자가 공백일 경우 공백 추가.
				FirstWord = true; // 첫 문자가 공백이므로 첫 문자는 대문자로 변경해야하므로 true.
			} else {
				if (FirstWord) { //// true면 첫 문자의 대문자로. false면 소문자로.
					sb.append(Character.toUpperCase(s.charAt(i)));
					FirstWord = false;
				} else {
					sb.append(Character.toLowerCase(s.charAt(i)));
				}
			}
		}
                return sb.toString();
	}
}
