package extend;

public class Game {
	protected String name;
	protected Soft soft;
	protected Controller controller;
	protected boolean power;

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

	public void setController(Controller controller) {
		this.controller = controller;
	}

	public void showStatus() {
		if (power) {
			System.out.printf("*----ゲーム機情報----* \n ゲーム機名：%s \n ソフト名：%s \n コントローラ：%s \n\n", name, soft.name,
					controller.name);
		} else {
			System.out.println("電源がついていません。");
		}
	}

}
