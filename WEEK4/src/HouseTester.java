
public class HouseTester {

	public static void main(String[] args) {
		House H1 = new House("house1",44.5);
		House H2 = new House("house2",44.5);
		House H3 = new House("house3",24.0);
		House H4 = new House("house4",44.5);

		H1.setName("example_"+H1.getName());
		H2.setName("example_"+H2.getName());
		H3.setName("example_"+H3.getName());
		H4.setName("example_"+H4.getName());

		System.out.println(H1.getName());
		System.out.println(H2.getName());
		System.out.println(H3.getName());
		System.out.println(H4.getName());
		System.out.println();
		
		
		if(H1.getArea()==H2.getArea()) {
			System.out.println(H2.getName());
		}
		if(H1.getArea()==H3.getArea()) {
			System.out.println(H3.getName());
		}
		if(H1.getArea()==H4.getArea()) {
			System.out.println(H4.getName());
		}
		System.out.println();
		
		double totalarea = H1.getArea() + H2.getArea() + H3.getArea() + H4.getArea();
		System.out.println("Total Area : "+totalarea);
	}

}
