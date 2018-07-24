package icehs.science.chapter04;

public class SeperateNumberTest {

	public static void main(String[] args) {
		int number = 456;
		System.out.println("숫자 :" + number);
		int hundrednumber = number / 100;
		System.out.println("백의 자리 수 :" + hundrednumber);
		int tennumber = (number % 100) / 10;
		System.out.println("십의 자리 수 :" + tennumber);
		int number1 = ( (number % 100) % 10);
		System.out.println("일의 자리 수:" + number1);
		

	}

}
