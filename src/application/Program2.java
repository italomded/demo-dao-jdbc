package application;

import java.util.List;

import model.dao.DepartmentDao;
import model.dao.DepartmentFactory;
import model.entities.Department;

public class Program2 {

	public static void main (String [] args) {
		
		DepartmentDao departmentDao = DepartmentFactory.createDepartmentDao();
		
		System.out.println("- TEST 01: department findById -");
		Department dep = departmentDao.findById(3);
		System.out.println(dep);
		
		System.out.println("\n- TEST 02: department findAll -");
		List<Department> list = departmentDao.findAll();
		list.forEach(System.out::println);
		
		System.out.println("\n- TEST 03: department insert -");
		dep.setName("Toys");
		departmentDao.insert(dep);
		System.out.println("Inserted! New Id = " + dep.getId());
		
		System.out.println("\n- TEST 04: department update -");
		Department newDep = new Department(7, "Music");
		departmentDao.update(newDep);
		System.out.println("Update Completed!");
		
		System.out.println("\n- TEST 05: department delete -");
		departmentDao.deleteById(9);
		System.out.println("Delete Completed!");
		
	}
	
}
