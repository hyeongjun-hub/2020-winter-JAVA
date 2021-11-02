package KioskAll;

public class MemberSet {
	private String ID;
	private String PW;
	private String Point;

	public MemberSet(String iD, String pW, String point) {
		ID = iD;
		PW = pW;
		Point = point;
	}

	public String getID() {
		return ID;
	}

	public String getPW() {
		return PW;
	}

	public String getPoint() {
		return Point;
	}

	public void setID(String iD) {
		ID = iD;
	}

	public void setPW(String pW) {
		PW = pW;
	}

	public void setPoint(String point) {
		Point = point;
	}

	@Override
	public String toString() {
		return "ID : " + ID + " PW : " + PW + " Point : " + Point;
	}

}
