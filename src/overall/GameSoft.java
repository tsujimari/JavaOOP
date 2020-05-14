package overall;

/**
 * ゲームソフトの標準的な機能を定義するゲームソフトインターフェース
 */
public interface GameSoft {

	/**
	 * ゲームソフトの情報を表示する
	 */
	public void loadSoft();

	/**
	 * ゲーム開始時の初期機能を実装する
	 */
	public void gameStart();

	/**
	 * 押されたボタンに応じた処理を実行する
	 * @param key String
	 */
	public void pushButton(String key);
}
