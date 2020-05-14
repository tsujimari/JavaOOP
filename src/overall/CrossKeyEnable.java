package overall;

/**
 * 十字キーを押した際の機能を定義した十字キーインターフェース
 */
public interface CrossKeyEnable {

	/**
	 * k キーが押された時の処理を実装する
	 */
	public void pushK();

	/**
	 * j キーが押された時の処理を実装する
	 */
	public void pushJ();

	/**
	 * l キーが押された時の処理を実装する
	 */
	public void pushL();

	/**
	 * h キーが押された時の処理を実装する
	 */
	public void pushH();
}
