package icehs.science.chapter06;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Coffee();
		americano.name = "�Ƹ޸�ī��";
		americano.price = 3500;
		americano.printCoffeeInfo();
		
		Coffee latte = new Coffee();
		latte.name = "ī���";
		latte.price = 4000;
		latte.printCoffeeInfo();
		
		Coffee makiatto = new Coffee();
		makiatto.name = "�����ƶ�";
		makiatto.price = 4500;
		makiatto.printCoffeeInfo();
		
		int totalPrice = americano.getePrice() + latte.getePrice() + makiatto.getePrice();
		
		System.out.println("�� �ݾ� :" + totalPrice + "��");
		
	}

}
