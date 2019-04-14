package com.zbz.repository;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zbz.dataobject.ProductCategory;

import junit.framework.Assert;
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

	@Autowired
	private ProductCategoryRepository repository;
	
	@Test
	public void test() {
		ProductCategory productCategory = repository.findOne(1);
		System.out.println(productCategory.toString());
//		fail("Not yet implemented");
	}
	@Test
	public void saveTest() {
//		ProductCategory productCategory = repository.findOne(1);
		ProductCategory productCategory = new ProductCategory("女生最爱",3);
		ProductCategory save = repository.save(productCategory);
		Assert.assertNotNull(null, save);
	}
	
	@Test
	public void findByCategoryTypeInTest() {
		List<Integer> list = Arrays.asList(2,3,4);
		List<ProductCategory> findByCategoryTypeIn = repository.findByCategoryTypeIn(list);
		Assert.assertEquals(3, findByCategoryTypeIn.size());
	}

}
