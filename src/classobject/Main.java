package classobject;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller("コントローラ");
		Soft gameSoft = new Soft("ゲームソフト", 2);
		Game game = new Game("PS4");

		game.setController(controller);
		game.setSoft(gameSoft);
		game.powerButton();
		game.setSoft(gameSoft);
		game.showStatus();
		game.powerButton();
		game.showStatus();
	}
}
