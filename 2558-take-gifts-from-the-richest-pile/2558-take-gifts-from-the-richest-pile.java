class Solution {
    public long pickGifts(int[] gifts, int k) {
        PriorityQueue<Integer> gift=new PriorityQueue<>(Collections.reverseOrder());

        //queue에 선물 수 저장
        for(int i:gifts){
            gift.offer(i);
        }

        //가장 선물이 많이 들어있는 더미를 제곱근
        for(int i=0; i<k; i++){
            gift.offer((int)Math.sqrt(gift.poll()));
        }

        long sum=0;

        //총 남은 선물 개수
         while (!gift.isEmpty()) {
            sum += gift.poll();
        }
        
    return sum;
    }
}