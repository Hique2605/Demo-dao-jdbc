package application;


import java.util.Date;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		SellerDao sellerDao =  DaoFactory.createSellerDao();
		
		System.out.println("=== TEST 1: seller findById =====");
		Seller seller = sellerDao.findById(3);
		System.out.println(seller);
		
		System.out.println("\n=== TEST 2: seller findByDepartment =====");
		Department department = new Department(2,null);
		List<Seller> list = sellerDao.findByDepartment(department);
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("\n=== TEST 3: seller findAll =====");
		list = sellerDao.findAll();
		for (Seller obj : list) {
			System.out.println(obj);
		}
		
		//podia ser o department, mas crie dphique para teste
		Department departmenthique = new Department(1,null);
		System.out.println("\n=== TEST 4: seller insert =====");
		Seller newSeller = new Seller(null, "Hique", "hique@gmail.com", new Date(), 8000.0,departmenthique);
		sellerDao.insert(newSeller);
		System.out.println("Inserido! Novo Id =  " + newSeller.getId());
		
		
		
	}

}


