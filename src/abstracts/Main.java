package abstracts;

public class Main {
	public static void main(String[] args) {
		// ゲーム機を作成し電源を入れる
		Game game = new OkaStation("岡ステーション", 1);
		game.powerButton();

		// 岡本の冒険ソフトを作成し、ゲーム機に設定する
		Soft adventure = new OkaAdventure("岡本の冒険", 4);
		game.setSoft(adventure);

		// 岡本の人生ソフトを作成し、ゲーム機に設定する
		Soft boardGame = new OkaBoardGame("岡本の人生", 5);
		game.setSoft(boardGame);
	}
}
