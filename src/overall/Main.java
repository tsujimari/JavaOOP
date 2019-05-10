package overall;

public class Main {
	public static void main(String[] args) {
		Game okaStation = new OkaStation("岡ステーション", 4);
		okaStation.powerButton();

		Soft okaAdventure = new OkaAdventure();
		okaStation.setSoft(okaAdventure);
		okaStation.gameStart();

		Soft okaBoardgame = new OkaBoardGame();
		okaStation.setSoft(okaBoardgame);
		okaStation.gameStart();

		okaStation.powerButton();
	}
}
