package com.amanda.Um.exceptions;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

public class UserNotFoundAdvice {

	@ResponseBody
	@ExceptionHandler(ProdutoNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	
	public Map<String, String> exceptionHandler(ProdutoNotFoundException ex){
		Map<String, String> errorMap= new HashMap<>();
		errorMap.put("errormessage", ex.getMessage());
		return errorMap;
		}
}
