package application;

import java.time.LocalDate;
import java.util.Locale;

import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		
		Department obj = new Department(1, "Books");
		System.out.println(obj);
		
		Seller seller = new Seller(2, "Bob", "bob@gmail.com", LocalDate.now(), 2400.0, obj);
		System.out.println(seller);
		
	}

}
