package application;

import java.util.Date;

import model.dao.DaoFactory;
import model.dao.SellerDao;
import model.entities.Department;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Department obj = new Department(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "hique@gmail.com", new Date(), 3000.0, obj);
		
		SellerDao sellerDao =  DaoFactory.creatSellerDao();
		
		System.out.println(seller);
		
		
		
	}

}
