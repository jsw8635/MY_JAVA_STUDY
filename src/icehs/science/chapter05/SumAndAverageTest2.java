package icehs.science.chapter05;

public class SumAndAverageTest2 {

	public static void main(String[] args) {
		int sum = 0;
		double avg = 0;
		
		for(int i = 1; i <= 500 ; i++) {
			sum += i;
		}
		avg = (double)
		System.out.println("ÇÕ°è :" + sum);
		System.out.println("Æò±Õ :" + (double)(sum / 500));
	}

}
