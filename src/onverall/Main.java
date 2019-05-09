package onverall;

public class Main {
	public static void main(String[] args) {
		Game game = new OkaStation("岡ステーション", 4);
		game.powerButton();

		Soft adventure = new OkaAdventure();
		game.setSoft(adventure);
		game.gameStart();

		Soft boardgame = new OkaBoardGame();
		game.setSoft(boardgame);
		game.gameStart();

		game.powerButton();
	}
}
