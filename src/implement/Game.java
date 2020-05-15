package implement;

/**
 * ゲーム機抽象クラス
 */
public abstract class Game {
	// ゲーム機名
	protected String name;
	// 接続ゲームソフト
	protected GameSoft soft;
	// 電源(`True`：電源入,`False`：電源切)
	protected boolean power;

	/**
	 * フィールドのゲーム機名に引数の値を設定する。さらに電源を切った状態にする
	 * @param name ゲーム機名
	 */
	public Game(String name) {
		this.name = name;
		this.power = false;
	}

	/**
	 * ゲーム機の電源ボタン。電源がついている場合は電源を切る。電源が切れている場合は電源をつける。
	 */
	public void powerButton() {
		if (power) {
			System.out.println("ゲーム機の電源を切ります。さようなら。\n");
			power = false;
		} else {
			System.out.println("ようこそ" + name + "へ。\n");
			power = true;
		}
	}

	/**
	 * ・ゲームソフトをセットする。フィールドの soft に、引数の値を設定する。
	 * @param soft 接続ゲームソフト
	 */
	public void setSoft(GameSoft soft) {
		this.soft = soft;
		if (power) {
			this.soft.loadSoft();
		}
	}

	/**
	 * ゲーム機の情報を表示する。
	 */
	public abstract void showStatus();

	/**
	 * セットされているゲームソフトを実行する。
	 */
	public abstract void gameStart();

}
