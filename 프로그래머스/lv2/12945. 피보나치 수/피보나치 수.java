class Solution {
    public int solution(int n) {
        int f1 = 1, f0 = 0, f = 0;
		if (n >= 2) {
			for (int i = 1; i < n; i++) {
				f = (f0 + f1)%1234567;
				f0 = f1;
				f1 = f;
			}
		}
        return f;
    }
}
