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
		
		System.out.println("������� :" + addResult);
		System.out.println("�E����� :" + subtractResult);
		System.out.println("���� ��� :" + multiplyResult);
		System.out.println("������ ��� :" + divisionResult);
		System.out.println("������ :" + reminderResult);

	}

}
