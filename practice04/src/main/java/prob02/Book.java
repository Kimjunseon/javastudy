package prob02;

public class Book {
	private int number;
	private String name;
	private String bookName;
	private boolean status;

	public Book(){
		
	}
	
	public Book(int i, String bookName, String name) {
		this.number = i;
		this.bookName = bookName;
		this.name = name;
	}
	
	public Book(boolean status){
		this.status = status;
		}
	
	public void status2(){
		if(status  == false) {
			status = true;
			System.out.println(bookName + "이 대여되었습니다.");
		}
		
	}
	
	

	public void show() {
		System.out.println("책 제목:" + bookName + ", 작가:" + name + ", 대여 유무:" + (status == false ? "재고있음":"대여중"));
	}
	
	
}
