package com.rest.controller;

import java.security.Provider.Service;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.rest.model.Electricity;
import com.rest.service.ElectricityService;
import com.rest.service.ElectricityServiceImp;

@RestController
public class ElectricityController {
	
	@Autowired
	public ElectricityServiceImp service;
	
	@PostMapping("/save")
	public String save(@RequestBody Electricity electricity){
		
		Electricity e1 =service.saveRec(electricity);
		String message=null;
		if (e1!=null) {
			message="data saved successfully";
			
		}
		else {
			message="data not saved";
			
		}
		return message;
	}
	@GetMapping("/getOne/{cId}")
	public Electricity getOne(@PathVariable int cId) {
		Electricity onerec = service.getOneRec(cId);
		return onerec;
	}
	@GetMapping("/getAll")
	public List<Electricity> getAll() {
		List<Electricity> allRec = service.getAll();
		return allRec;
	}
	@PutMapping("/update/{cId}")
	public Electricity update(@RequestBody Electricity electricity,@PathVariable int cId) {
		Electricity update = service.update(electricity, cId);
		
		return update;
	}
	@DeleteMapping("/delete/{cId}")
	public void delete(@PathVariable int cId) {
	service.deleteRec(cId);
		
	}
	
}
