package icehs.science.chapter07;

public class ItBookTest {

	public static void main(String[] args) {
		ItBook it1 = new ItBook("SQL Plus", 50000 , 5.5);
		it1.printItBookInfo();
		ItBook it2 = new ItBook("Java 2.0", 28000,3.2);
		it2.printItBookInfo();
		ItBook it3 = new ItBook("JSP Servlet", 37000, 6.9);
		it3.printItBookInfo();
		
		System.out.println();
		
		System.out.println(it1.getTitle() + "정가와 할인율을 변경합니다.");
		it1.setDiscountRate(9.5);
		it1.printItBookInfo();
		
		System.out.println();
		System.out.println(it2.getTitle()+ "정가를 변경합니다.");
		it2.setPrice(33000);
		it2.printItBookInfo();
		
		System.out.println();
		System.out.println(it3.getTitle() + "제목과 할인율을 변경합니다.");
		it3.setTitle("Servlet & JSP");
		it3.setDiscountRate(12.6);
		it3.printItBookInfo();
		
		
		
		
		
		

	}

}
