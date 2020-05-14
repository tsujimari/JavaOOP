package abstracts;

/**
 * ゲームソフトの実体である岡本の冒険クラス
 */
public class OkaAdventure extends Soft {

	// キャラクター名
	String characterName;

	/**
	 * コンストラクタ
	 * @param name ソフト名
	 * @param size 容量
	 */
	public OkaAdventure(String name, int size) {
		super(name, size);
	}

	/**
	 * ゲームソフトを読み込む
	 */
	@Override
	void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n キャラクター名： %s \n\n", name, size,
				characterName);
	}

	/**
	 * ゲームを開始する
	 */
	@Override
	void gameStart() {
		System.out.printf("[%s] \nゲームを始める前に冒険者の名前を設定してください。 \n", this.name);
		// 標準入力を受け取る
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("冒険者の名前 > ");
		this.characterName = scanner.nextLine();
		System.out.printf("冒険者*%s*で冒険を始めます。\n\n", this.characterName);
	}

}
