package icehs.science.chapter05;

public class VariousSumTest {

	public static void main(String[] args) {
		int sumTotal = 0;
		int sumOdd = 0;
		int sumEven = 0;
		
		for(int i=1;i<=1000;i++) {
			if(i % 2 == 0) {
				sumOdd += i;
			}else{
				sumEven += i;
			}
			
		
		}
		
		
		sumTotal = sumOdd + sumEven;
		
		System.out.println("1���� 1000������ �� : " + sumTotal);
		System.out.println("1���� 1000���� ¦������ ��" + sumOdd);
		System.out.println("1���� 1000���� Ȧ������ �� :" + sumEven);
		
		

		
	}
}		