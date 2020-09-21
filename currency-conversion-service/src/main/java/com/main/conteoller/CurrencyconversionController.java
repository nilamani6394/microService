package com.main.conteoller;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.main.Bean.ConversionBean;
import com.main.serviceproxy.CurrencyexchangeserviceProxy;



@RestController
public class CurrencyconversionController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private CurrencyexchangeserviceProxy proxy;
	
	@GetMapping("/currency-converter/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean convertCurency(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
		Map<String, String>uriVariables= new HashMap<>(); 
		uriVariables.put("from", from);
		uriVariables.put("to", to);
		ResponseEntity<ConversionBean>resp = new RestTemplate()
				.getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
				ConversionBean.class,
				uriVariables);
               ConversionBean cbresp=resp.getBody();
		return new ConversionBean(cbresp.getId(),from,to,cbresp.getConversationmultople(),
						quantity,quantity.multiply(cbresp.getConversationmultople()),cbresp.getPort());
		
	}
	@GetMapping("/currency-converter-feign/from/{from}/to/{to}/quantity/{quantity}")
	public ConversionBean convertCurencyFfeign(@PathVariable String from,
			@PathVariable String to,
			@PathVariable BigDecimal quantity) {
		
               ConversionBean cbresp=proxy.retrivefromexchange(from, to);
              // Logger.info("{}",cbresp);
               logger.info("{}", cbresp);
               
              //https://courses.in28minutes.com/courses/889617/lectures/16332385
               //https://courses.in28minutes.com/courses/956375/lectures/17724329
		return new ConversionBean(cbresp.getId(),from,to,cbresp.getConversationmultople(),
						quantity,quantity.multiply(cbresp.getConversationmultople()),cbresp.getPort());
		
	}
}
