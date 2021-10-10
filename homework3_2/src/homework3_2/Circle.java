package homework3_2;

public class Circle {
	private double radius;
	private double diametr;
	
	Circle (double radius, double diametr){
		this.radius = radius;
		this.diametr = diametr;
	}
	public void S_Circle() {
		double S = 3.14*diametr/2;
		System.out.println("Площа кола: " + S); 
	}
	
	public void L_Circle() {
		double L = 2*radius*3.14;
		System.out.println("Довжина кола: " + L); 
	}
	
}
