class Solution {
    boolean solution(String s) {
        boolean answer=false;
        String str = s.toUpperCase();
        int count=0, count2=0;

        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='P'){
                count++;
            }else if(str.charAt(i)=='Y'){
                count2++;
            }
        }
	
        if(count==count2) answer=true;
        return answer;
    }
}