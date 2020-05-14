package implement;

/**
 * A ボタンと B ボタンを押した際の機能を定義した文字ボタンインターフェース
 */
public interface CharacterKeyEnable {
	/**
	 *  A ボタンが押された時の処理を実装する。
	 * @return int
	 */
	public int pushA();

	/**
	 * B ボタンが押された時の処理を実装する。
	 * @return int
	 */
	public int pushB();
}
