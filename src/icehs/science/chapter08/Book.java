package icehs.science.chapter08;

public class Book {
	
	private String title;

	private int price;
	
	
	
	public String getTitle() {
		return title;
	}
	public int getPrice() {
		return price;
	}
	Book(){
		
		}
	Book(String title, int price){
		this.title = title;
		this.price = price;
	}
	
	Book (String title, String author, int price){
		this.title = title;

		this.price = price;
	}
	
	Book (String title, String author){
		this.title = title;

	}
	void printBookInfo() {
		System.out.println("제목 : " + this.title);

		System.out.println("가격 : " + this.price);
	}
	

}
