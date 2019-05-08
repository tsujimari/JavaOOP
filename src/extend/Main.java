package extend;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller("コントローラ");
		Soft adventure = new OkaAdventure("岡本の冒険", 4, "岡本");
		Soft game_soft = new Soft("ゲームソフト", 2);
		Game game = new OkaStation("岡ステーション", 1);

		game.setController(controller);
		game.powerButton();
		game.setSoft(adventure);
		game.showStatus();
		game.setSoft(game_soft);
		game.showStatus();
	}
}
