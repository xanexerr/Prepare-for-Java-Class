
public class House {
	private String name;
	private double area;
	
	House(){
		name = "";
		area = 0.0;
	}
	House(String n,double a){
		name=n;
		area=a;
	}
	
	public String getName() {
		return name;
	}
	
	public double getArea() {
		return area;
	}
	
	public void setName(String n) {
		name = n;
	}
	public void setArea(double a) {
		area = a;
	}
	
}
