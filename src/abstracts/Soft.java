package abstracts;

/**
 * ゲームソフト抽象クラス
 */
public abstract class Soft {
	// ゲームソフト名
	String name;
	// ゲーム容量
	int size;

	/**
	 * コンストラクタ
	 * @param name ゲームソフト名
	 * @param size ゲーム容量
	 */
	public Soft(String name, int size) {
		this.name = name;
		this.size = size;
	}

	/**
	 * ゲームソフトの詳細を表示する
	 */
	void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n\n", name, size);
	}

	/**
	 * ゲームを開始する
	 */
	abstract void gameStart();

}
