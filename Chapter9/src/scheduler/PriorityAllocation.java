package scheduler;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객등급이 높은 고객의 call을 먼저 가져옵니다.");
	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무 순력도가 높은 상담원에게 먼저 배분합니다.");
	}

}
