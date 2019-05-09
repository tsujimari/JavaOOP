package abstracts;

public class OkaAdventure extends Soft {

	String characterName;

	public OkaAdventure(String name, int size) {
		super(name, size);
	}

	@Override
	void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n キャラクター名： %s \n\n", this.name,
				this.size, this.characterName);
	}

	@Override
	void gameStart() {
		System.out.printf("[%s] \nゲームを始める前に冒険者の名前を設定してください。 \n", this.name);
		// 標準入力を受け取る
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("冒険者の名前 > ");
		this.characterName = scanner.nextLine();
		System.out.printf("冒険者*%s*で冒険を始めます。\n\n", this.characterName);
		scanner.close();
	}

}
