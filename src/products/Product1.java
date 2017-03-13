package products;

import factory.ProductFactory;

public class Product1 implements Product {
	
	private int productID;
	
//	static {
//		try {
//			((ProductFactory) Class.forName("factory.ProductFactory").newInstance()).registerProduct(1, Class.forName("products.Product1"));
//		} catch (InstantiationException e) {
//			e.printStackTrace();
//		} catch (IllegalAccessException e) {
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) {
//			e.printStackTrace();
//		}
//	}
	
	public Product1() {
		productID = 1;
	}

	@Override
	public void useProduct() {
		System.out.println("Product " + productID + " is used.");
	}

}
