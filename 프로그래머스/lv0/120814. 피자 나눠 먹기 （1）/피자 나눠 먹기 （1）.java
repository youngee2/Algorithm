class Solution {
    public int solution(int n) {
        int count=n/7;
        int count2 = n%7;
        
        if(count2>0){
           count++; 
        }
        return count;
    }
}