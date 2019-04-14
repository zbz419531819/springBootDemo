package com.zbz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbz.dataobject.ProductCategory;
import com.zbz.repository.ProductCategoryRepository;
import com.zbz.service.CategoryService;

/**
 * 类目
 * @author Administrator
 *
 */
@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private ProductCategoryRepository repository;
	@Override
	public ProductCategory findOne(Integer categoryId) {
		return repository.findOne(categoryId);
	}

	@Override
	public List<ProductCategory> findAll() {
		return repository.findAll();
	}

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType) {
		return repository.findByCategoryTypeIn(categoryType);
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		return repository.save(productCategory);
	}

}
