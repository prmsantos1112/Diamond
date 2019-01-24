package Application;

import Devices.ComboDevice;
import Devices.ConcretPrinter;
import Devices.ConcretScanner;

public class Program {

	public static void main(String[] args) {
		
		ConcretPrinter printer = new ConcretPrinter("1080");
		printer.processDoc("My Letter");
		printer.print("My Letter");
		System.out.println();
		
		ConcretScanner scanner = new ConcretScanner("2003");
		scanner.processDoc("My Email");
		System.out.println("Scan Result: " + scanner.scan());
		
		System.out.println();
		ComboDevice combodev = new ComboDevice("2081");
		combodev.processDoc("My dissertation");
		combodev.print("My dissertation");
		System.out.println("Scan Result: " + combodev.scan());

	}	

}
