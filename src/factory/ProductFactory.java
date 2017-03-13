package factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import products.Product;

public class ProductFactory {
	
	@SuppressWarnings("rawtypes")
	private Map<Integer, Class> productMap = new HashMap<>();

	@SuppressWarnings("rawtypes")
	public void registerProduct (int id, Class className) {
		productMap.put(id, className);
		System.out.println("Register product " + id);
		System.out.println(productMap);
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Product createProduct(int id) {
		System.out.println(productMap);
		Class productClass = productMap.get(id);
//		try {
//			Constructor constructor = productClass.getConstructor();
//			try {
//				Product newProduct = (Product) constructor.newInstance();
//				return newProduct;
//			} catch (InstantiationException e) {
//				e.printStackTrace();
//			} catch (IllegalAccessException e) {
//				e.printStackTrace();
//			} catch (IllegalArgumentException e) {
//				e.printStackTrace();
//			} catch (InvocationTargetException e) {
//				e.printStackTrace();
//			}
//		} catch (NoSuchMethodException e) {
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			e.printStackTrace();
//		}
		try {
			// more concrete to get a new sub class instance
			Product newProduct = (Product) productClass.newInstance();
			return newProduct;
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return null;
	}
}
