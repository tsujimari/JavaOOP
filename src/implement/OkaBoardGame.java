package implement;

import java.util.Random;

/**
 * ゲームソフトの実体である岡本の人生クラス
 */
public class OkaBoardGame extends Soft implements CharacterKeyEnable {
	// ゲームソフト名
	final String name = "岡本の人生";
	// ゲームソフト容量
	final int size = 10;
	// ステージ名
	String stage;
	// プレーヤー人数
	int playNumber;

	/**
	 * ゲームソフトの名前を取得する
	 * @return String
	 */
	@Override
	public String getGameName() {
		return this.name;
	}

	/**
	 * ゲームソフトを読み込む
	 */
	@Override
	public void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n\n", name, size);
	}

	/**
	 * ゲームを開始する
	 */
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

	/**
	 * キー場押された時の処理
	 */
	@Override
	public void pushButton(String key) {
		if (key.equals("a")) {
			System.out.printf("%d万円手に入れた。\n", pushA());
		}
		if (key.equals("b")) {
			System.out.printf("%d万円失った。\n", pushB());
		}
	}

	/**
	 * A ボタンが押された時の処理を実装する
	 * 0〜10 までのランダムな整数を戻り値として返す
	 */
	@Override
	public int pushA() {
		return new Random().nextInt(10);
	}

	/**
	 * B ボタンが押された時の処理を実装する
	 * 0〜50 までのランダムな整数を戻り値として返す
	 */
	@Override
	public int pushB() {
		return new Random().nextInt(50);
	}

}
