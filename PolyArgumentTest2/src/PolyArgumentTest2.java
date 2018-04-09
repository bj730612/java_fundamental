import java.util.Vector;

class Product {
	int price;
	int bonusPoint;
	
	Product(int price) {
		this.price = price;
		this.bonusPoint = (int)(price/10);
	}
	
	Product() {
		
	}
}
	
class Tv extends Product {
	Tv() { super(100); }
	
	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() { super(200); }
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() { super(50); }
	
	public String toString() {
		return "Audio";
	}
}

class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	// Product [] item = new Product[10];
	Vector item = new Vector();
	int i =0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			return;
		}
		
		money -= p.price;
		bonusPoint += p.bonusPoint;
		//item[i++] = p;
		item.add(p);
		System.out.println(p + "를 구입하셨습니다.");
		}
	
	void summary() {
		int sum = 0;
		String itemlist = "";
		
		for(int i=0; i<item.size(); i++) {
			Product p = (Product) item.get(i);
			sum += p.price;
			itemlist += (i==0 ? "" + p : ", " + p);
		}
/*		for(int i=0; i<item.length; i++) {
			if(item[i] == null)
				break;
			sum += item[i].price;
			itemlist += item[i].toString() + " ";
		}*/
		
		System.out.println("구입하신 물품의 총금액은 " + sum + "만원입니다.");
		System.out.println("구입하신 물품은 " + itemlist + "입니다.");
	}
}

public class PolyArgumentTest2 {
	public static void main(String[] args) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
	}

}
 