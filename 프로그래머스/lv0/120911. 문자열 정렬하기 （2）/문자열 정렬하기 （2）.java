import java.util.Arrays;
class Solution {
    	public static String solution(String my_string) {
String low = my_string.toLowerCase();
		char[] chars = low.toCharArray();
		Arrays.sort(chars);
		low = new String(chars);
		return low;
    }
}