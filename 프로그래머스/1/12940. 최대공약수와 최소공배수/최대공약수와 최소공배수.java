class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2]; //최대 공약수와 최소 공배수 반환
        
        answer[0]= gcd(n,m); //answer[0]=최대공약수 
        answer[1]= lcm(n,m); //answer[1]=최소공배수
    
        return answer; 
    }
        
        //최소 공배수 구하는 메서드
        //두 수의 곱한 값을 최대 공약수로 나눔.
        public static int lcm(int n,int m){
            return (n*m)/gcd(n,m);
        }
        
        
        //최대공약수 구하는 메서드(유클리드 호제법)
        public static int gcd(int n,int m){
            while(m!=0){
                int tmp=m;
                m=n%m;
                n=tmp;
            }
        return n;
    }
}