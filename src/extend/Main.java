package extend;

public class Main {
	public static void main(String[] args) {
		Soft adventure = new OkaAdventure("岡本の冒険", 4, "岡本");
		Soft gameSoft = new Soft("ゲームソフト", 2);
		Game game = new OkaStation("岡ステーション", 1);

		game.powerButton();
		game.setSoft(adventure);
		game.showStatus();
		game.setSoft(gameSoft);
		game.showStatus();
	}
}
