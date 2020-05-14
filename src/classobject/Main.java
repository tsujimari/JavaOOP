package classobject;

public class Main {
	public static void main(String[] args) {
		Soft gameSoft = new Soft("ゲームソフト", 2);
		Game game = new Game("PS4");

		// ゲームソフトをゲーム機にセットする
		game.setSoft(gameSoft);
		// ゲーム機の電源を入れる
		game.powerButton();
		// ゲームソフトをゲーム機にセットする
		game.setSoft(gameSoft);
		// ゲーム機の情報を表示する
		game.showStatus();
		// ゲーム機の電源を消す
		game.powerButton();
		// ゲーム機の情報を表示する
		game.showStatus();
	}
}
