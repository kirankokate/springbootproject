package com.demoproject.kiran.cVSfVSsDI;

import org.springframework.stereotype.Component;

@Component
public class DiscountServiceImpl implements DiscountService {

	@Override
	public void getDiscount() {
		System.out.println("10% discount");
	}

}
