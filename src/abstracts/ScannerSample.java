package abstracts;

public class ScannerSample {
	public static void main(String[] args) {
		// 標準入力を受け取る
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("文字を入力してください。 > ");
		String input = scanner.nextLine();
		System.out.printf("入力した文字は%sです。", input);
		scanner.close();
	}
}
