import java.util.Scanner;

class Main {
	public static int solution(String str) {
		if(str.equals(" ")) {
			return 0;
		}else {
			str=str.trim();
			String[] arr = str.split(" ");
			return arr.length;
			}
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		sc.close();
		System.out.println(Main.solution(str));
	}
}