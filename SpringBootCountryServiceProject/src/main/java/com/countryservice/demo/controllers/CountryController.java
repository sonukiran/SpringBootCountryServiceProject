package com.countryservice.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.countryservice.demo.services.CountryService;
@RestController
public class CountryController {
	@Autowired
	CountryService countryService;
	
	@GetMapping("/getcountries")
	public List getCountries()
	{
		return countryService.getAllCountries();
	}
	


}
