package icehs.science.chapter06;

public class Car {
	
	public String name = "ICEī";
	int oilAmount;
	double distance;
	
	//������� ������ �׸��� �Ÿ��� �޾Ƽ� ����ϴ� �޼���
	void driveCar(String start, String end, double driveDistance) {
		distance += driveDistance;
		oilAmount -= (driveDistance / 20);
		System.out.println(start + "���� " + end + "���� " + driveDistance + "km �����Ͽ����ϴ�.");
	}
	
	//�⸧ ���� �޼���
	void addOil(int oil) {
		oilAmount += oil;
		System.out.println("�ֹ��� " + oil + "L �����մϴ�.");
	}
	
	//���� �⸧���� �� �� �ִ� �Ÿ��� ����ϴ� �޼���
	void calculateDriveDistance() {
		System.out.println("���� ������ �Ÿ��� �� " + (double)(oilAmount*20) + "km �Դϴ�.");
		
	}
	
	//�ڵ����� ������ ������ִ� �޼���
	void printCarInfo() {
		System.out.println("[" + name + "~] ���� �⸧�� �� :" + oilAmount + "L, �� ����Ÿ� :" + distance + "km");
	}
	
	
}
