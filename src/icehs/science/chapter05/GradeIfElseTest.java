package icehs.science.chapter05;

public class GradeIfElseTest {

	public static void main(String[] args) {
		int gildongScore = 92;
		int gilsoonScore = 85;
		
		if(gildongScore >= 90 && gildongScore <= 100) {
			System.out.println("ȫ�浿 : A���� �Դϴ�.");
			
		}else {
			System.out.println("ȫ�浿 : A������ ���� ���߽��ϴ�.");
		}
		
		if(gilsoonScore >= 90 && gilsoonScore <= 100) {
			System.out.println("ȫ��� : A�����Դϴ�.");
		}else {
			System.out.println("ȫ��� : A������ ���� ���߽��ϴ�.");
		}

	}

}