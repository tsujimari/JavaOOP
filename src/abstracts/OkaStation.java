package abstracts;

public class OkaStation extends Game {

	private int version;

	public OkaStation(String name, int version) {
		super(name);
		this.version = version;
	}

	@Override
	public void showStatus() {
		if (power) {
			System.out.printf("*----ゲーム機情報----* \n ゲーム機名：%s%s \n バージョン： %d \n ソフト名：%s \n\n", name, version, version,
					soft.name);
		} else {
			System.out.println("電源がついていません。");
		}
	}

}
