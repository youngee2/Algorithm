class Solution {
    public int solution(int left, int right) {
    //수의 약수가 홀수일때는 제곱근일때만
    
    int sum=0;
        //left부터 right까지 
        while(left<=right){ 
           
            //num에 Math.sqrt(left) 
            // Math.sqrt는 ()안에 값을 double타입의 제곱근으로 반환해줌.
            int num=(int)Math.sqrt(left); 
            
            //제곱근으로 반환받은 값을 다시 제곱해서 left와 같으면 수의 약수는 홀수.
            // 그래서 answer에서 left를 뺀다.
            // 만약 짝수면 left를 더한다.
                if(num*num==left){ 
                    sum-=left;   
                }else{
                    sum+=left;
                }
            
            //left 증가
            left++;
        }
        return sum;
    }
}