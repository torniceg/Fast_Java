package chapter8;

public class Avante extends Car {

	@Override
	protected void start() {
		System.out.println("Avante �õ��� �մϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Avante �޸��ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Avante ����ϴ�.");
	}

	@Override
	protected void turnOff() {
		System.out.println("Avante �õ��� ���ϴ�.");
	}

}
