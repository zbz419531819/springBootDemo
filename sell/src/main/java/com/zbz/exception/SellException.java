package com.zbz.exception;

import com.zbz.enums.ResultEnum;

public class SellException  extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer code;

    public SellException(ResultEnum resultEnum) {
        super(resultEnum.getMessage());

        this.code = resultEnum.getCode();
    }

    public SellException(Integer code, String message) {
        super(message);
        this.code = code;
    }
}
