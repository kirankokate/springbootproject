package com.demoproject.kiran.cVSfVSsDI;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DiscountClient {

	/**
	 * field-based DI
	 */
	@Autowired
	DiscountService discountService;

//	/**
//	 * Constructor-Based DI
//	 * 
//	 */
//	@Autowired
//	public DiscountClient(DiscountService discountService) {
//		this.discountService = discountService;
//	}
	
//	/**
//	 * setter-based DI
//	 * @param discountService
//	 */
//	@Autowired
//	public void setDiscountService(DiscountService discountService) {
//		this.discountService = discountService;
//	}	
	
	public void getDiscount() {
		discountService.getDiscount();
	}
}
