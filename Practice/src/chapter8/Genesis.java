package chapter8;

public class Genesis extends Car {

	@Override
	protected void start() {
		System.out.println("Genesis �õ��� �մϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Genesis �޸��ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Genesis ����ϴ�.");
	}

	@Override
	protected void turnOff() {
		System.out.println("Genesis �õ��� ���ϴ�.");
	}

}
