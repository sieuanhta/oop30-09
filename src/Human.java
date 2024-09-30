
public class Human {

	int yearBorn;
	String name;
	
	Human(){};
	Human(int year, String ten){
		this.yearBorn = year;
		this.name = ten;
	}
	
	public int getYearBorn() {
		return yearBorn;
	}
	public void setYearBorn(int yearBorn) {
		this.yearBorn = yearBorn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	
}
