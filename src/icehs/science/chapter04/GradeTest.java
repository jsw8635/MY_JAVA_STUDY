package icehs.science.chapter04;

public class GradeTest {

	public static void main(String[] args) {
		int grade = 75;
		
		boolean aGrade = (grade>=90)&&(grade<=100);
		boolean bGrade = (grade>=80)&&(grade<=90);
		boolean cGrade = (grade>=70)&&(grade<=80);
		boolean dGrade = (grade>=60)&&(grade<=70);
		
		System.out.println("A���� : " + aGrade);
		System.out.println("B���� : " + bGrade);
		System.out.println("C���� : " + cGrade);
		System.out.println("D���� : " + dGrade);
		
		
	}

}
