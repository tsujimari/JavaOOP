package overall;

public class Main {
	public static void main(String[] args) {
		// 岡ステーションインスタンス
		Game okaStation = new OkaStation("岡ステーション", 4);
		// 岡ステーションの電源を入れる
		okaStation.powerButton();

		// 岡本の冒険インスタンス
		Soft okaAdventure = new OkaAdventure();
		// 岡本の冒険をセット
		okaStation.setSoft(okaAdventure);
		// 岡本の冒険を開始する
		okaStation.gameStart();

		// 岡本の人生インスタンス
		Soft okaBoardgame = new OkaBoardGame();
		// 岡本の人生をセット
		okaStation.setSoft(okaBoardgame);
		// 岡本の人生を開始する
		okaStation.gameStart();

		okaStation.powerButton();
	}
}
