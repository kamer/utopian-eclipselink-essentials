package com.test;

import com.daos.ProductDao;
import com.entities.PRODUCT;

public class Test {

	public static void main(String[] args) {
		new Test().method();
	}

	private void method() {

		// Create
		/*
		 * PRODUCT product = new PRODUCT(); product.setNAME("iPhone 7 Plus");
		 * product.setTYPE("Smartphone"); new ProductDao().create(product);
		 */

		// Read
		/*
		 * PRODUCT product = new ProductDao().read(1L);
		 * System.out.println("Name:" + product.getNAME() + " Category:" +
		 * product.getTYPE());
		 */

		// Update
		/*
		 * PRODUCT product = new ProductDao().read(1L);
		 * product.setNAME("iPhone 8"); new ProductDao().update(product);
		 */

		// Delete
		/* new ProductDao().delete(1L); */

	}

}
