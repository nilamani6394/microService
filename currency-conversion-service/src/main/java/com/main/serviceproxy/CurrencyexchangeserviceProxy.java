package com.main.serviceproxy;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;


import com.main.Bean.ConversionBean;

//@FeignClient(name="currency-exchange")
@FeignClient(name="Netflix-zull-Api-Gateway-server")
@RibbonClient(name="currency-exchange")

public interface CurrencyexchangeserviceProxy {
	@GetMapping("currency-exchange/currency-exchange/from/{from}/to/{to}")
	public ConversionBean retrivefromexchange(@PathVariable ("from") String from,
			@PathVariable ("to") String to);

}
/*-Xms256m
-Xmx1024m*/