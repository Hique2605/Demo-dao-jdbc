package application;

import java.util.Date;

import model.entities.Departament;
import model.entities.Seller;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Departament obj = new Departament(1, "Books");
		
		Seller seller = new Seller(21, "Bob", "hique@gmail.com", new Date(), 3000.0, obj);
		
		System.out.println(seller);
		
		
		
	}

}
