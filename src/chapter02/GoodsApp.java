package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.name = "nikkon";
		goods.price = 200000;
		goods.countSold = 10;
		goods.countStock = 30;
		
		System.out.println("이름:" + goods.name + 
							",가격:" + goods.price +
							",재고:" + goods.countStock +
							",판매:" + goods.countSold);
		
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();
		
		
		System.out.println(Goods.countOfGoods);

		double i = 3 * Math.PI;
		
		int a = 10;
		a = 20;
		
		final int B =20; //상수(값대입이 여기가 끝. 모두다 대문자로 표현하는 관례)
		// B = 30; // 상수를 변경못하므로 에러
	}
}
