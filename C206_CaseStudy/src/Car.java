
/**
 * I declare that this code was written by 20039761.
 * I will not copy or allow others to copy my code.
 * I understand that copying code is considered as plagiarism.
 *
 * 20039761, 2 Aug 2021 5:28:18 pm
 */

public class Car {
	private int carId;
	private String name;
	private String maxSpeed;
	private int price;
	
	public Car(int carId, String name, String maxSpeed, int price) {
		this.carId = carId;
		this.name = name;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(String maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getCarId() {
		return carId;
	}

	public void setCarId(int carId) {
		this.carId = carId;
	}
	

}
