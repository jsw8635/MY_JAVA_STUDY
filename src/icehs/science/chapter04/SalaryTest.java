package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int money = 1000000;
		int yearMoney = money*12;
		int annualSalary = yearMoney - yearMoney * 10 / 100;
		int bonus = money * 20 / 100 * 4;
		int annualbonus = bonus - bonus * 55 / 1000;
		int money1 = annualSalary + annualbonus;
		System.out.println("���� : " + yearMoney + "," + "���Ŀ��� :" + annualSalary);
		System.out.println("���ʽ� :" + bonus + "," + "���ĺ��ʽ�" + annualbonus);
		System.out.println("���޾� :" + money1);

	}

}
