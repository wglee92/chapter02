package chapter02;

public class GoodsApp {

	public static void main(String[] args) {
		Goods goods = new Goods();
		goods.name = "nikkon";
		goods.price = 200000;
		goods.countSold = 10;
		goods.countStock = 20;
		
		System.out.println("이름:" + goods.name + 
							",가격:" + goods.price +
							",재고:" + goods.countStock +
							",판매:" + goods.countSold);
		
		Goods goods1 = new Goods();
		Goods goods2 = new Goods();
		Goods goods3 = new Goods();

		System.out.println(Goods.countOfGoods);
	}
}
