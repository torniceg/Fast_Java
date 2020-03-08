package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main( String[] args ) {
		
		Customer customer1 = new Customer(1001, "�ں���");
		Customer customer2 = new Customer(1002, "�ξ�");
		Customer customer3 = new VIPCustomer(1003, "ä����");
		Customer customer4 = new GoldCustomer(1004, "����");
		Customer customer5 = new GoldCustomer(1005, "����");
		
		ArrayList<Customer> customerList = new ArrayList<Customer>();
		customerList.add(customer1);
		customerList.add(customer2);
		customerList.add(customer3);
		customerList.add(customer4);
		customerList.add(customer5);
		
		for( Customer customer : customerList ) {
			customer.calcPrice(10000);
			System.out.println(customer.showCustomerInfo());
		}

	}

}
