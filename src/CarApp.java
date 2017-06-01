
public class CarApp {

	public static void main(String[] args) {
		
		Car c1 = new Car();
		c1.setModel("BMW");
		c1.setColor("Black");
		c1.setYear(2016);
		
		c1.start();
		c1.setSpeed(50);
		c1.drivingSpeed();
		
		c1.setSpeed(10);
		c1.stop(0);
		
		Car c2 = new Car();
		c2.setModel("Jetta");
		c2.setColor("Red");
		c2.setYear(2016);
		
		c2.start();
		c1.start();
		c1.setSpeed(30);
		c2.setSpeed(30);
		c1.drivingSpeed();
		c2.drivingSpeed();
		c1.setSpeed(40);
		c1.accelerate();
		c1.passing(c1, c2);
		
	}
	
   

}
