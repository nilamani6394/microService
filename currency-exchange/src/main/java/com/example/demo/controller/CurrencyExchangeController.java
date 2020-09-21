package com.example.demo.controller;

import java.math.BigDecimal;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.ExchangeValue;
import com.example.demo.repository.ExchangevalueRepository;

@RestController
public class CurrencyExchangeController {
	private Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	private Environment enc;
	@Autowired
	private ExchangevalueRepository exrp;
	@GetMapping("/currency-exchange/from/{from}/to/{to}")
	public ExchangeValue retrivefromexchange(@PathVariable String from,@PathVariable String to) {
		ExchangeValue exchangeva= exrp.findByFromAndTo(from, to);
		exchangeva.setPort(Integer.parseInt(enc.getProperty("local.server.port")));
		logger.info("{}", exchangeva);
		return exchangeva;
		
		
	}

}
