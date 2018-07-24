package icehs.science.chapter04;

public class CalculatorTest {

	public static void main(String[] args) {
		int number1 = 20;
		int number2 = 7;
		
		int addResult = number1 + number2;
		int subtractResult = number1 - number2;
		int multiplyResult = number1 * number2;
		int divisionResult = number1 / number2;
		int reminderResult = number1 % number2;
		
		System.out.println("µ¡¼À°á°ú :" + addResult);
		System.out.println("–E¼À°á°ú :" + subtractResult);
		System.out.println("°ö¼À °á°ú :" + multiplyResult);
		System.out.println("³ª´°¼À °á°ú :" + divisionResult);
		System.out.println("³ª¸ÓÁö :" + reminderResult);

	}

}
