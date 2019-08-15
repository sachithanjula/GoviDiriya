package com.mobios.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobios.model.Province;
import com.mobios.repository.GDRepository;

@RestController
@RequestMapping("/api/govidiriya")
public class GDController {
	
	@Autowired
	GDRepository gdRepository;
	
	//Get All Province
	@GetMapping("/provinces")
	public List<Province> getAllProvinces(){
		return gdRepository.findAll();
	}

}
