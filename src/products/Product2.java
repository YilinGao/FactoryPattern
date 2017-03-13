package products;

import factory.ProductFactory;

public class Product2 implements Product {
	
	private int productID;
	
//	static {
//		try {
//			((ProductFactory) Class.forName("factory.ProductFactory").newInstance()).registerProduct(2, Class.forName("products.Product2"));
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	public Product2() {
		productID = 2;
	}

	@Override
	public void useProduct() {
		System.out.println("Product " + productID + " is used.");
	}
}
