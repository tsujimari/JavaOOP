package extend;

public class OkaAdventure extends Soft {
	String character_name;

	public OkaAdventure(String name, int size, String character_name) {
		super(name, size);
		this.character_name = character_name;
	}

	@Override
	void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n キャラクター名： %s \n\n", name, size,
				character_name);
	}

}
