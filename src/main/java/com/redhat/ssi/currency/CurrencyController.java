package com.redhat.ssi.currency;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RequestMapping(value = "/curr")
@RestController
public class CurrencyController {

	@Autowired
	CurrencyRepository currencyRepository;
	
	@RequestMapping(method = RequestMethod.GET, value = "/findCurrName")
	@ApiOperation("Returns the list of currency available")
	public List<Currency> findAll() {
		List<Currency> curr = currencyRepository.findAll();
		return curr;
	}

}
