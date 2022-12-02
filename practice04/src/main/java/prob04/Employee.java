package prob04;
// 오버라이딩 문제 포인트, 컬러포인트와 유사함
public class Employee {
	private String name;
	private int salary;

	public Employee() {
	}

	Employee(String name, int salary) {
		this.name = name;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public void getInformation() {
		System.out.println( "이름:" + name + "연봉:" + salary );
	}
}