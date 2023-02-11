/**
 * 
 */
package com.ott;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

/**
 * @author c302318
 *
 */
@Service
public class ProductServiceImpl implements ProductServiceI {
	
	private static Map<String,Product> productRepo = new HashMap<String,Product>();
	
	static {
		Product p1 = new Product(); p1.setId("1");p1.setName("Honey");
		Product p2 = new Product(); p2.setId("2");p2.setName("Almond");
		productRepo.put(p1.getId(), p1);productRepo.put(p2.getId(), p2);
	}

	@Override
	public Collection<Product> getProducts() {
		// TODO Auto-generated method stub
		return productRepo.values();
	}

}
