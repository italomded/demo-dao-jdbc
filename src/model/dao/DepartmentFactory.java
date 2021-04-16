package model.dao;

import model.dao.impl.DepartmentDaoJDBC;

public class DepartmentFactory {

	public static DepartmentDao createDepartmentDao() {
		return new DepartmentDaoJDBC();
	}
	
}
