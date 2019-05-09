package abstracts;

public class Main {
	public static void main(String[] args) {
		Controller controller = new Controller("コントローラ");
		Game game = new OkaStation("岡ステーション", 1);
		game.setController(controller);
		game.powerButton();

		Soft adventure = new OkaAdventure("岡本の冒険", 4);
		game.setSoft(adventure);

		Soft boardGame = new OkaBoardGame("岡本の人生", 5);
		game.setSoft(boardGame);
	}
}
