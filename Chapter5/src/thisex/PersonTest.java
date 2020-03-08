package thisex;

public class PersonTest {

	public static void main(String[] args) {

		Person personNoname = new Person();
		personNoname.showInfo();
		System.out.println(personNoname.getSelf());
		
		Person personLee = new Person("Lee",20);
		personLee.showInfo();
		System.out.println(personLee);
		
		Person p = personLee.getSelf();
		System.out.println(p);
		
		p.age = 21;
		personLee.showInfo();
	}

}
