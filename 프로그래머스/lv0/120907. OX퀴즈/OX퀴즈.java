class Solution {
    public String[] solution(String[] quiz) {
        String[] answer= new String[quiz.length];
		for(int i=0; i<quiz.length; i++) {
			//1. 빈 공간으로 잘라 배열에 넣기.
			String[] splitArr = quiz[i].split(" ");
			int sum=0;
			//2. 부호가 -인지 +인지 확인하기
			if(splitArr[1].equals("-")) {
				sum=Integer.parseInt(splitArr[0])-Integer.parseInt(splitArr[2]);
			}else {
				sum=Integer.parseInt(splitArr[0])+Integer.parseInt(splitArr[2]);
			}
			//3. = 다음 값이 계산한 값과 같은지 확인하기
			//4. 같으면 O 틀리면 X
			if(Integer.parseInt(splitArr[4])==sum) {
				answer[i]="O";
			}else {
                answer[i]="X";
			}
		}
        return answer;
    }
}