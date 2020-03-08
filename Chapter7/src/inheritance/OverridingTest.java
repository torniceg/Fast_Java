package inheritance;

public class OverridingTest {
	
	public static void main( String[] args ) {

		Customer customerLee = new Customer(10010,"�̼���");
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020,"������");
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println( customerLee.showCustomerInfo() + " ���� �ݾ��� " + priceLee + "�� �Դϴ�." );
		System.out.println( customerKim.showCustomerInfo() + " ���� �ݾ��� " + priceKim + "�� �Դϴ�." );
		
		Customer customerNo = new VIPCustomer(10030, "������");
		customerNo.bonusPoint = 10000;
		
		System.out.println( customerNo.showCustomerInfo() + " ���� �ݾ��� " + customerNo.calcPrice(10000) + "�� �Դϴ�." );
		
	}

}
