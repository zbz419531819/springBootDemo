package com.zbz.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zbz.dataobject.ProductCategory;
import com.zbz.repository.ProductCategoryRepository;
import com.zbz.service.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService{

	@Autowired
	private ProductCategoryRepository repository;
	
	@Override
	public ProductCategory findOne(Integer categoryId) {
		// TODO Auto-generated method stub
		return repository.findOne(categoryId);
	}

	@Override
	public List<ProductCategory> findAll() {
		// TODO Auto-generated method stub
		return repository.findAll();
	}

	@Override
	public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
		// TODO Auto-generated method stub
		return repository.findByCategoryTypeIn(categoryTypeList);
	}

	@Override
	public ProductCategory save(ProductCategory productCategory) {
		// TODO Auto-generated method stub
		return repository.save(productCategory);
	}

}
