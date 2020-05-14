package extend;

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
	public OkaAdventure(String name, int size, String characterName) {
		super(name, size);
		this.characterName = characterName;
	}

	/**
	 * ゲームソフトを読み込む
	 */
	@Override
	void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n キャラクター名： %s \n\n", name, size,
				characterName);
	}

}
