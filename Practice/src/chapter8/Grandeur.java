package chapter8;

public class Grandeur extends Car {

	@Override
	protected void start() {
		System.out.println("Grandeur �õ��� �մϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Grandeur �޸��ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Grandeur ����ϴ�.");
	}

	@Override
	protected void turnOff() {
		System.out.println("Grandeur �õ��� ���ϴ�.");
	}

}
