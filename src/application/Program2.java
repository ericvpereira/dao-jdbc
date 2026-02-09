package application;

import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		/*
		System.out.println("=== TEST 1: department insert ===");
		Department newDepartment = new Department(null, "Acessorios");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! New department = " + newDepartment.getName());
		
		System.out.println("\n=== TEST 2: department update ===");
		Department department = departmentDao.findByIdDepartment(6);
		department.setName("Esportes");
		departmentDao.update(department);
		System.out.println("Update completed");
		
		System.out.println("\n=== TEST 3: department delete ===");
		System.out.print("Enter id for delete test: ");
		int id = sc.nextInt();
		departmentDao.deleteById(id);
		System.out.println("Delete completed");*/
		
		System.out.println("\n=== TEST 4: department findById ===");
		Department dep = departmentDao.findByIdDepartment(3);
		System.out.println(dep);
		
		sc.close();
	}
}
