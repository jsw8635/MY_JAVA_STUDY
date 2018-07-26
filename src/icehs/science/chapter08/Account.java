package icehs.science.chapter08;

public class Account {
	private String accName;
	private String accNo;
	private int balance;
	private double interestRate;
	
	
	
	public String getAccName() {
		return accName;
	}

	public double getInterestRate() {
		return interestRate;
	}
	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public Account(String accName, int balance, double interestRate) {
		this.accName = accName;
		this.balance = balance;
		this.interestRate = interestRate;
	}

	public int getBalance() {
		return balance;
	}
	
	void deposit(int money) {
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else {
		balance += money;
		}
	}
	void withdraw(int money) {
		if(money < 0) {
			System.out.println("[����] �ݾ��� ������ �Է��� �� �����ϴ�.");
		}else if(balance < money) {
			System.out.println("[����] �ܾ��� �����մϴ�");
		}else {
		System.out.println(balance -= money);
		}
	}
	void printAccountInfo() {
		
		System.out.println("���� " + accNo + " ( ������ :" + accName + ")");
		System.out.println("�ܾ� : " + balance + "��");
	}
	
	public int calculateInterest() {
		balance += (int)(balance * interestRate / 100);
		return balance;
	}

	

}
