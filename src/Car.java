
public class Car extends Vehicle{
	
	private String model;
	private int year;
	private String color;
	private int speed;
	
	
	public Car(){
		
	}
	
	public Car(String model, int year, String color){
		
		this.model = model;
		this.year = year;
		this.color = color;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public void start(){
		System.out.println("The " + getColor() + " " + getModel() + " is starting ");
	}

	public void accelerate(){
		
		speed = speed + 10;
		 
		System.out.println("The " + getColor() + " " + getModel() + "  is accelerating ");
	
	}
	public void drivingSpeed(){
		
		System.out.println("The " + getColor() + " " + getModel() + " is going " + getSpeed() + " mph"); 
	}
	
	public void stop(int speed){
		
		System.out.println("The " + getColor() + " " + getModel() + " is decreasing its speed to " + getSpeed() + " mph"); 
		System.out.println("The " + getColor() + " " + getModel() + " is Stopped");
		
	}
	
	public void passing(Car car1, Car car2){
		
		System.out.println("The " + getColor() + " " + car1.getModel() + " passed the " + getColor() + " " + car2.getModel() );
	}
}
