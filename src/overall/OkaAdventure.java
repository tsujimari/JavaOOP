package overall;

import java.util.Random;

/**
 * ゲームソフトの実体である岡本の冒険クラス
 */
public class OkaAdventure extends Soft implements CrossKeyEnable, CharacterKeyEnable {

	// ゲームソフト名
	final String name = "岡本の冒険";
	// ゲームソフト容量
	final int size = 4;
	// キャラクター名
	String characterName;

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
		System.out.printf("[%s] \nゲームを始める前に冒険者の名前を設定してください。 \n", name);
		// 標準入力を受け取る
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("冒険者の名前 > ");
		this.characterName = scanner.nextLine();
		System.out.printf("冒険者*%s*で冒険を始めます。\n\n", characterName);

	}

	/**
	 * キー場押された時の処理
	 */
	@Override
	public void pushButton(String key) {
		if (key.equals("k")) {
			pushK();
		}
		if (key.equals("j")) {
			pushJ();
		}
		if (key.equals("l")) {
			pushL();
		}
		if (key.equals("h")) {
			pushH();
		}
		if (key.equals("a")) {
			System.out.printf("冒険者%sは攻撃力（%d）で攻撃します。\n", characterName, pushA());
		}
		if (key.equals("b")) {
			System.out.printf("冒険者%sは守備力（%d）で防御します。\n", characterName, pushB());
		}
	}

	/**
	 * A ボタンが押された時の処理を実装する
	 * 0〜100 までのランダムな整数を戻り値として返す
	 */
	@Override
	public int pushA() {
		int attakStatus = new Random().nextInt(100);
		return attakStatus;
	}

	/**
	 * B ボタンが押された時の処理を実装する
	 * 0〜100 までのランダムな整数を戻り値として返す
	 */
	@Override
	public int pushB() {
		int defenceStatus = new Random().nextInt(100);
		return defenceStatus;
	}

	/**
	 * k キーが押された時の処理を実装する
	 * 「ジャンプします。」を画面に出力する。
	 */
	@Override
	public void pushK() {
		System.out.println("ジャンプします。");
	}

	/**
	 * j キーが押された時の処理を実装する
	 * 「しゃがみます。」を画面に出力する。
	 */
	@Override
	public void pushJ() {
		System.out.println("しゃがみます。");
	}

	/**
	 *  l キーが押された時の処理を実装する
	 *  「右に移動します。」を画面に出力する。
	 */
	@Override
	public void pushL() {
		System.out.println("右に移動します。");
	}

	/**
	 * h キーが押された時の処理を実装する
	 * 「左に移動します。」を画面に出力する。
	 */
	@Override
	public void pushH() {
		System.out.println("左に移動します。");
	}

}
