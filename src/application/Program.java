package application;

import java.time.LocalDate;
import java.util.List;
import java.util.Locale;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {
	
	public static void main (String [] args) {
		
		Locale.setDefault(Locale.US);
		
		SellerDao sellerDao = DaoFactory.createSellerDao();
		
		System.out.println("- TEST 01: seller findById -");
		Seller seller = sellerDao.findById(3);
		
		System.out.println(seller);
		
		System.out.println("\n- TEST 02: seller findByDepartment -");
		Department dep = new Department(2, null);
		List<Seller> list = sellerDao.findByDepartment(dep);
		list.forEach(System.out::println);
		
		System.out.println("\n- TEST 03: seller findAll -");
		list = sellerDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n- TEST 04: seller insert -");
		Seller newSeller = new Seller(null, "Greg", "greg@gmail.com", LocalDate.now(), 2400.0, dep);
		sellerDao.insert(newSeller);
		System.out.println("Inserted! New id = " + newSeller.getId());
		
		System.out.println("\n- TEST 05: seller update -");
		seller = sellerDao.findById(1);
		seller.setName("Bruce Wayne");
		sellerDao.update(seller);
		System.out.println("Update completed!");
		
		System.out.println("\n- TEST 06: seller delete -");
		sellerDao.deleteById(8);
		System.out.println("Delete completed!");
		
	}

}
