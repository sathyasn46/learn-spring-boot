package learn.springboot.learnspringboot.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.springboot.learnspringboot.objects.Course;

@RestController
public class CurrencyConfigurationController {
	
	@Autowired
	private CurrencyServiceConfiguration currencyServiceConfiguration;

	@GetMapping(path = "api/v1/CurrencyConfiguration")
	public CurrencyServiceConfiguration retreiveCurrrencyCongigurations() {
		 return currencyServiceConfiguration;
	}
	
}
