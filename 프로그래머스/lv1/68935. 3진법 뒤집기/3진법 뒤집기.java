class Solution {
    public int solution(int n) {
        StringBuilder sb = new StringBuilder();
		sb.append(Integer.toString(n, 3)); //n을 3진법으로 변환 후 값을 힙영역에 저장.
		String answer=(sb.reverse().toString()); //문제의 조건. 3진법을 앞뒤로 뒤집어라.
        return Integer.parseInt(answer,3);//앞뒤로 뒤집은 수를 다시 10진수로.
        //Integer.parseInt(String s, int radix)에서 바꿀 수를 s에, 넣은 수가 몇 진수인지 radix에.
    }
}