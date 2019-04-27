package com.zbz.VO;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.Data;

@Data
public class ProductVO {
	 @JsonProperty("name")
	    private String categoryName;

	    @JsonProperty("type")
	    private Integer categoryType;

	    @JsonProperty("foods")
	    private List<ProductInfoVO> productInfoVOList;
}
