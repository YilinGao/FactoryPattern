package client;

import factory.ProductFactory;
import products.Product;

public class Client {
	
//	static {
//		try {
//			Class.forName("products.Product1");
//			Class.forName("products.Product2");
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}

	public static void main(String[] args) {
		ProductFactory myFactory = new ProductFactory();

		try {
			// both ways can get a Class instance
			myFactory.registerProduct(1, products.Product1.class);
//			myFactory.registerProduct(1, Class.forName("products.Product1"));
			myFactory.registerProduct(2, Class.forName("products.Product2"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		Product myProduct = myFactory.createProduct(1);
		myProduct.useProduct();
	}

}
