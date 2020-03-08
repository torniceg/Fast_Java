package polymorphism;

import java.util.ArrayList;

public class CustomerTest {

	public static void main( String[] args ) {
		
		Customer customer1 = new Customer(1001, "박보영");
		Customer customer2 = new Customer(1002, "민아");
		Customer customer3 = new VIPCustomer(1003, "채수빈");
		Customer customer4 = new GoldCustomer(1004, "고보결");
		Customer customer5 = new GoldCustomer(1005, "예원");
		
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
