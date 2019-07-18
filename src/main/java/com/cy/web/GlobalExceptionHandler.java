package com.cy.web;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;


/**
 * 全局异常处理类
 */
@RestControllerAdvice
public class GlobalExceptionHandler {

	/**
	 * 施工中
	 * @param e
	 */
	@ExceptionHandler(RuntimeException.class)
	public void doHandleRuntimeException(
			RuntimeException e) {
		e.printStackTrace();
	}
}
