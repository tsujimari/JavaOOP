package overall;

import java.util.Random;

public class OkaAdventure extends Soft implements CrossKeyEnable, CharacterKeyEnable {

	final String name = "岡本の冒険";
	final int size = 4;
	String characterName;

	@Override
	public void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n\n", name, size);
	}

	@Override
	public void gameStart() {
		System.out.printf("[%s] \nゲームを始める前に冒険者の名前を設定してください。 \n", name);
		// 標準入力を受け取る
		java.util.Scanner scanner = new java.util.Scanner(System.in);
		System.out.print("冒険者の名前 > ");
		this.characterName = scanner.nextLine();
		System.out.printf("冒険者*%s*で冒険を始めます。\n\n", characterName);

	}

	@Override
	public void pushButton(String key) {
		if (key.equals("k")) {
			pushK();
		}
		if (key.equals("j")) {
			pushJ();
		}
		if (key.equals("l")) {
			pushL();
		}
		if (key.equals("h")) {
			pushH();
		}
		if (key.equals("a")) {
			System.out.printf("冒険者%sは攻撃力（%d）で攻撃します。\n", characterName, pushA());
		}
		if (key.equals("b")) {
			System.out.printf("冒険者%sは守備力（%d）で防御します。\n", characterName, pushB());
		}
	}

	@Override
	public int pushA() {
		int attakStatus = new Random().nextInt(100);
		return attakStatus;
	}

	@Override
	public int pushB() {
		int defenceStatus = new Random().nextInt(100);
		return defenceStatus;
	}

	@Override
	public void pushK() {
		System.out.println("ジャンプします。");
	}

	@Override
	public void pushJ() {
		System.out.println("しゃがみます。");
	}

	@Override
	public void pushL() {
		System.out.println("右に移動します。");
	}

	@Override
	public void pushH() {
		System.out.println("左に移動します。");
	}

}
