package implement;

public class Main {
	public static void main(String[] args) {
		// ゲーム機を作成し電源を入れる
		Game game = new OkaStation("岡ステーション", 4);
		game.powerButton();

		// 岡本の人生ソフトを作成し、ゲーム機に設定する
		Soft boardgame = new OkaBoardGame();
		game.setSoft(boardgame);
		// ゲームを開始する
		game.gameStart();

		// ゲームが終了すると、ゲーム機の電源を切る
		game.powerButton();
	}
}
