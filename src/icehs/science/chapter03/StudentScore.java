package icehs.science.chapter03;

public class StudentScore {

	public static void main(String[] args) {
		double koreaScore = 87.1;
		double englishScore = 83.2;
		double mathScore = 94.7;
		int intkoreaScore = (int)koreaScore;
		int intenglishScore = (int)englishScore;
		int intmathScore = (int)mathScore;
		
		System.out.println("수학 : " + intmathScore);
		System.out.println("영어 : " + intenglishScore);
		System.out.println("국어 : " + intkoreaScore);
		

	}

}
