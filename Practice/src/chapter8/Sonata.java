package chapter8;

public class Sonata extends Car {

	@Override
	protected void start() {
		System.out.println("Sonata �õ��� �մϴ�.");
	}

	@Override
	protected void drive() {
		System.out.println("Sonata �޸��ϴ�.");
	}

	@Override
	protected void stop() {
		System.out.println("Sonata ����ϴ�.");
	}

	@Override
	protected void turnOff() {
		System.out.println("Sonata �õ��� ���ϴ�.");
	}

}
