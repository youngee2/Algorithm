class Solution {
    public int solution(int n, int k) {
    int sum=0;
    
            int c = n/10;
        sum+=(n*12000)+(k*2000)-(c*2000);
    
        return sum ;
    }
}