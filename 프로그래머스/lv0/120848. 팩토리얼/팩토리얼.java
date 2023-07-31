class Solution {
    public int solution(int n) {
		int answer=1;
		int count=0;
		while(true) {
           answer+=answer*count;	
			if(n>=answer) {
				count++;
			}else {
				break;
			}
		}
        return count;
    }
}