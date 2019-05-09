package abstracts;

public class OkaBoardGame extends Soft {
	String stage;
	int playNumber;

	public OkaBoardGame(String name, int size) {
		super(name, size);
	}

	@Override
	void gameStart() {
		System.out.printf("[%s]\n %sへようこそ。\nゲームを始める前に、ステージとプレイヤーの人数を設定してください。\n", this.name, this.name);
		// 標準入力を受け取る
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("ステージ名 > ");
		this.stage = scanner.nextLine();
		System.out.print("\nプレイヤー人数 > ");
		this.playNumber = Integer.valueOf(scanner.nextLine());

		System.out.printf("ステージ名：%s\nプレイヤー人数：%d人\nでゲームを始めます。", this.stage, this.playNumber);

		scanner.close();
	}

}
