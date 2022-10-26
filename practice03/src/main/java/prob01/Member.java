package prob01;

public class Member {
	private String memberID;
	private String memberName;
	private int memberPoint;
	
	public void info() {
		System.out.println("회원[아이디: "+ memberID +
						   ", 이름:" + memberName +
						   ", 점수: " + memberPoint + "]");
		
	}
	
	public String getMemberID() {
		return memberID;
	}
	public void setMemberID(String memberID) {
		this.memberID = memberID;
	}
	public String getMemberName() {
		return memberName;
	}
	public void setMemberName(String memberName) {
		this.memberName = memberName;
	}
	public int getMemberPoint() {
		return memberPoint;
	}
	public void setMemberPoint(int memberPoint) {
		this.memberPoint = memberPoint;
	}
}