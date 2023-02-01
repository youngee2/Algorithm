import java.util.Scanner;

class Main {
	public static String solution(String str) {
		StringBuilder sb = new StringBuilder();
		for (char num = 'a'; num <= 'z'; num++) {
			sb.append(str.indexOf(num)+" ");
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		sc.close();
		System.out.println(Main.solution(str));
	}
}