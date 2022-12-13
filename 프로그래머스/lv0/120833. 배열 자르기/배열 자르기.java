import java.util.*;
class Solution {
	    public static int[] solution(int[] numbers1, int num1, int num2) {
	      int position = num1;
	      int numbers2[]=Arrays.copyOfRange(numbers1, position, num2+1);
	        return numbers2;

	}
}