package extend;

public class Main {
	public static void main(String[] args) {
		// Softクラスを継承したOkaAdventureオブジェクトを作成
		Soft adventure = new OkaAdventure("岡本の冒険", 4, "岡本");
		// Softオブジェクトを作成
		Soft gameSoft = new Soft("ゲームソフト", 2);
		// OkaStationオブジェクトを作成
		Game game = new OkaStation("岡ステーション", 1);

		// ゲーム機の電源を入れる
		game.powerButton();
		// 岡本の冒険ソフトを設定する
		game.setSoft(adventure);
		// ゲーム機の状態を確認する
		game.showStatus();
		// 通常のソフトを設定する
		game.setSoft(gameSoft);
		// ゲーム機の状態を確認する。
		// 岡本の冒険を設定した場合と出力結果が異なることを確認
		game.showStatus();
	}
}
