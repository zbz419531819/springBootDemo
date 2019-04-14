package com.zbz.service.impl;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.zbz.dataobject.ProductCategory;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {
	@Autowired
	private CategoryServiceImpl categoryService;
	@Test
	public void testFindOne() {
		ProductCategory findOne = categoryService.findOne(1);
		Assert.assertEquals(new Integer(1), findOne.getCategoryId());
	}

	@Test
	public void testFindAll() {
		List<ProductCategory> findAll = categoryService.findAll();
		Assert.assertNotEquals(new Integer(0), new Integer(findAll.size()));
	}

	@Test
	public void testFindByCategoryTypeIn() {
		List<ProductCategory> findAll = categoryService.findByCategoryTypeIn(Arrays.asList(1,2,3,4));
		Assert.assertNotEquals(new Integer(0), new Integer(findAll.size()));
	}

	@Test
	public void testSave() {
		ProductCategory pro = new ProductCategory("男生专享",10);
		ProductCategory save = categoryService.save(pro);
		Assert.assertNotNull(save);
	}

}
