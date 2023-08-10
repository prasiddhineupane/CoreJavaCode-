package multipleInheretance;

public class C implements A,B{

	@Override
	public void make() {
		System.out.println("Iphone");
		
	}

	@Override
	public void value() {
		System.out.println(">$700");
		
	}

	@Override
	public void color() {
		System.out.println("green");
		
	}

	@Override
	public void price() {
		System.out.println("$800");
		
	}

	@Override
	public void model() {
		System.out.println("8");
		
	}
	
	

}
