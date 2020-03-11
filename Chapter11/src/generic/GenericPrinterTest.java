package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter.toString());
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter.toString());
		
		powderPrinter.printing();
		plasticPrinter.printing();
		
//		GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		
		GenericPrinter printer = new GenericPrinter();
		
	}

}
