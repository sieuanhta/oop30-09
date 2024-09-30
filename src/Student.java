
public class Student extends Human {

	String MSSV;

	Student(){};
	Student( int year, String ten, String MSV)
	{
		this.yearBorn = year;
		this.name = ten;
		this.MSSV = MSV;
	}
	
	public String getMSSV() {
		return MSSV;
	}

	public void setMSSV(String mSSV) {
		MSSV = mSSV;
	}
	
}
