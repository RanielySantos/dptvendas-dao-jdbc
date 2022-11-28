package application;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao depDao = DaoFactory.createDepartmentDao();
		System.out.println("\n=== TEST 1: department Insert ===");
		Department newDep = new Department(null, "Games");
		depDao.insert(newDep);
		System.out.println("Inserted! New id = " + newDep.getId());
	}

}
