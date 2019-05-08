package classobject;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller("コントローラ");
		Soft game_soft = new Soft("ゲームソフト", 2);
		Game game = new Game("PS4");

		game.setController(controller);
		game.setSoft(game_soft);
		game.powerButton();
		game.setSoft(game_soft);
		game.showStatus();
		game.powerButton();
		game.showStatus();
	}
}
