package extend;

public class Soft {
	String name;
	int size;

	public Soft(String name, int size) {
		this.name = name;
		this.size = size;
	}

	void loadSoft() {
		System.out.printf("*----ゲームソフトを読み込みました。----* \n ゲームソフト名：%s \n ソフト容量：%s GB \n\n", name, size);
	}

}
