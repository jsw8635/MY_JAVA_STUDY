package icehs.science.chapter06;

public class OverloadingTest {

	public static void main(String[] args) {
		Overloading over = new Overloading();
		
		over.addition(100, 300);
		over.addition(122.1, 200.5);
		over.addition("ANT", "World");

	}

}
