class Solution {
    public boolean solution(int x) {
        /*
        boolean answer = true;
        String str = Integer.toString(x);
        int sum=0;
        for(int i=0; i<str.length(); i++){
            sum+=(int)(str.charAt(i)-'0');
        }
        if(x%sum!=0){
            answer=false;
        }
        return answer;
    */
        int num=x; //자연수 x 대입
        int sum=0; 
        boolean answer=false;
        
        while(num>0){ //num이 0보다 클 때 까지
            sum+=(num%10); // num%10하면 num의 마지막 자리의 값이 나오는데 그 값을 sum에 더함
            num/=10; // num/10으로 자리수를 하나 줄임.
        }
        
        //하샤드 수인지 확인
        // x가 x의 자리 수 합인 sum으로 나누어떨어지면 하샤드 수이므로 answer를 true
          if(x%sum==0){ 
                answer=true;
            }
        return answer;
    }
}