package dao;

import java.util.ArrayList;

import org.omg.CORBA.PUBLIC_MEMBER;

import dto.Product;

public class ProductRepository{
	
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	private static ProductRepository instance = new ProductRepository();
	
	public static ProductRepository getInstance() {
		return instance;
	}
	
	public ProductRepository() {
		Product aaa = new Product("P1234", "aaa", 1234);
		aaa.setdecription("aaa");
		aaa.setcategory("english");
		aaa.setmanufacturer("usa");
		aaa.setunitInStock(100);
		aaa.setcondition("new");
		
		Product bbb = new Product("P1235", "bbb", 1235);
		aaa.setdecription("bbb");
		aaa.setcategory("english");
		aaa.setmanufacturer("usa");
		aaa.setunitInStock(100);
		aaa.setcondition("new");
		
		Product ccc = new Product("P1236", "ccc", 1236);
		aaa.setdecription("ccc");
		aaa.setcategory("english");
		aaa.setmanufacturer("usa");
		aaa.setunitInStock(100);
		aaa.setcondition("new");
		
		listOfProducts.add(aaa);
		listOfProducts.add(bbb);
		listOfProducts.add(ccc);
	
		
	}
	
	public Product getProductById(String productId) {
		Product productById = null;
		
		for (int i = 0; i < listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null && product.getProductId() != null && product.getProductId().equals(productId)) {
				productById = product;
				break;
				
			}
		}
		return productById;
	}
	
	public ArrayList<Product> getAllProducts() {
		return listOfProducts;
	}
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
}
