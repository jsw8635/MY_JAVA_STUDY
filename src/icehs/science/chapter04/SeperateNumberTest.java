package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		System.out.println("���� :" + number);
		int hundrednumber = number / 100;
		System.out.println("���� �ڸ� �� :" + hundrednumber);
		int tennumber = (number % 100) / 10;
		System.out.println("���� �ڸ� �� :" + tennumber);
		int number1 = ( (number % 100) % 10);
		System.out.println("���� �ڸ� ��:" + number1);
		

	}

}
