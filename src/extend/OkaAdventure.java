package extend;

public class OkaAdventure extends Soft {
	String characterName;

	public OkaAdventure(String name, int size, String characterName) {
		super(name, size);
		this.characterName = characterName;
	}

	@Override
	void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n キャラクター名： %s \n\n", name, size,
				characterName);
	}

}
