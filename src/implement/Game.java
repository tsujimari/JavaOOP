package implement;

public abstract class Game {
	String name;
	Soft soft;
	boolean power;

	public Game(String name) {
		this.name = name;
		this.power = false;
	}

	public void powerButton() {
		if (power) {
			System.out.println("ゲーム機の電源を切ります。さようなら。\n");
			power = false;
		} else {
			System.out.println("ようこそ" + name + "へ。\n");
			power = true;
		}
	}

	public void setSoft(Soft soft) {
		this.soft = soft;
		if (power) {
			this.soft.loadSoft();
		}
	}

	public abstract void showStatus();

	public abstract void gameStart();

}
