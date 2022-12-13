class Solution {
    public static int solution(int n) {
		String str = Integer.toString(n);
		int sum = 0;
		for (int i = 0; i < str.length(); i++) {
			sum+=Integer.parseInt(str.substring(i,i+1));
		}
		return sum;
    }
}