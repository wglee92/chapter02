package chapter02;

public class Goods {
	static int countOfGoods;
	
	public Goods() {
//		Goods.countOfGoods = Goods.countOfGoods + 1; 같은 클래스이므로 현재는 Goods. 이 없어도 편의성을 봐준다. 원칙은 클래스명 필요.
		countOfGoods = countOfGoods + 1;
	}
	String name;
	int price;
	int countStock;
	int countSold;
}
