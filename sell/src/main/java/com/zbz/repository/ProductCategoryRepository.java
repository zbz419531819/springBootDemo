package com.zbz.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.zbz.dataobject.ProductCategory;

public interface ProductCategoryRepository extends JpaRepository<ProductCategory, Integer>{

	List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryType);
}
