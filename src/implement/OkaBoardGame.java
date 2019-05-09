package implement;

import java.util.Random;

public class OkaBoardGame extends Soft implements CharacterKeyEnable {
	final String name = "岡本の人生";
	final int size = 10;
	String stage;
	int playNumber;

	@Override
	public void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n\n", name, size);
	}

	@Override
	public void gameStart() {
		System.out.printf("[%s]\n %sへようこそ。\nゲームを始める前に、ステージとプレイヤーの人数を設定してください。\n", name, name);
		// 標準入力を受け取る
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("ステージ名 > ");
		stage = scanner.nextLine();
		System.out.print("\nプレイヤー人数 > ");
		this.playNumber = Integer.valueOf(scanner.nextLine());

		System.out.printf("ステージ名：%s\nプレイヤー人数：%d人\nでゲームを始めます。\n", stage, playNumber);
	}

	@Override
	public void pushButton(String key) {
		if (key.equals("a")) {
			System.out.printf("%d万円手に入れた。\n", pushA());
		}
		if (key.equals("b")) {
			System.out.printf("%d万円失った。\n", pushB());
		}
	}

	@Override
	public int pushA() {
		return new Random().nextInt(10);
	}

	@Override
	public int pushB() {
		return new Random().nextInt(50);
	}

}
