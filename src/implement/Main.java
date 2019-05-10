package implement;

public class Main {
	public static void main(String[] args) {
		Game game = new OkaStation("岡ステーション", 4);
		game.powerButton();

		Soft boardgame = new OkaBoardGame();
		game.setSoft(boardgame);
		game.gameStart();

		game.powerButton();
	}
}
