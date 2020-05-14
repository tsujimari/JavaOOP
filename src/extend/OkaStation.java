package extend;

/**
 * ゲーム機の実体である岡ステーションクラス
 */
public class OkaStation extends Game {

	// バージョン
	private int version;

	/**
	 * コンストラクタ
	 * @param name ソフト名
	 * @param version バージョン
	 */
	public OkaStation(String name, int version) {
		super(name);
		this.version = version;
	}

	/**
	 * ゲーム機の状態を確認する
	 */
	@Override
	public void showStatus() {
		if (power) {
			System.out.printf("*----ゲーム機情報----* \n ゲーム機名：%s%s \n バージョン： %d \n ソフト名：%s \n\n", name, version, version,
					soft.name);
		} else {
			System.out.println("電源がついていません。");
		}
	}

}
