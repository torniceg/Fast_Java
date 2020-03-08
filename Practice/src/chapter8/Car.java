package chapter8;

public abstract class Car {
	
	protected abstract void start();
	protected abstract void drive();
	protected abstract void stop();
	protected abstract void turnOff();
	
	final public void run() {
		start();
		drive();
		stop();
		turnOff();
	}
}
