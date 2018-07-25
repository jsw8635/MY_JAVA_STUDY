package icehs.science.chapter06;

public class StudentTest {

	public static void main(String[] args) {
		Student hong = new Student();
		hong.name = "홍길동";
		hong.stuID = "S001";
		hong.korean = 94;
		hong.math = 80;
		hong.english = 89;

		
		hong.printStudendtInfo();
		hong.calculateAVG();		
		System.out.println();
		
		System.out.println(" * 학번을 변경합니다!!!");
		
		System.out.println();
		hong.changeStudentID("STU0001");
		
		hong.printStudendtInfo();

	}

}
