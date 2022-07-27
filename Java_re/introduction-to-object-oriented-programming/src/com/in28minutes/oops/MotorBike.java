package com.in28minutes.oops;

public class MotorBike {
	// state
	private int speed; // member variable

	MotorBike() {
		this(5);
		/*
		 * this가 가리키는 MotorBike에서 매개변수를 5를 넣었으므로 매개변수가 1개인 MotorBike(int speed) 생성자가
		 * 호출되는것임
		 */
	}

	MotorBike(int speed) {
		this.speed = speed;
	}

	// behavior
	// method
	// inputs -> int speed
	// outputs -> void
	// name -> setSpeed
	
	/*
	 * void setSpeed(int speed) {// local variable this.speed = speed; }
	 * 
	 * int getSpeed() { return this.speed; }
	 */


	void start() {
		System.out.println("Bike Started");
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		if (speed > 0)
			this.speed = speed;
	}

	public void increaseSpeed(int howMuch) {
		setSpeed(this.speed + howMuch);
	}

	public void decreaseSpeed(int howMuch) {
		setSpeed(this.speed - howMuch);
	}
}
