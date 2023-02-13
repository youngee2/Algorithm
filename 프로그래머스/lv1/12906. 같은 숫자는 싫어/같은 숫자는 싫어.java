import java.util.*;

public class Solution {
    	public static Stack<Integer> solution(int[] arr) {
		Stack<Integer> stack = new Stack<>();
		for (int i = 0; i < arr.length; i++) {
			if (stack.size() >= 1) {
				if (stack.peek() != arr[i])
					stack.push(arr[i]); 
			} else {
				stack.push(arr[i]);
			}
		}
		return stack;
	}
}