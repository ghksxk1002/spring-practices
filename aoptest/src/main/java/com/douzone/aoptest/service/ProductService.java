package com.douzone.aoptest.service;

import javax.management.RuntimeErrorException;

import org.springframework.stereotype.Service;

import com.douzone.aoptest.vo.ProductVo;

@Service
public class ProductService {

	public ProductVo find(String name) {

		System.out.println("[ProductService] find all..");
		if (true) {
			throw new RuntimeException("Find Exception");
		}
		return new ProductVo(name);
	}
}
