package model.dao;

import model.dao.impl.SellerDaoJDBC;

public class DaoFactory {

	//opercaoes staticas para estanciar os daos
	
	public static SellerDao creatSellerDao() {
		return new SellerDaoJDBC();
	}
	
	
	
	
	
}
