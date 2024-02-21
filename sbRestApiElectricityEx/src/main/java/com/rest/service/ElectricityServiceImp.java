package com.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rest.model.Electricity;
import com.rest.repo.ElectricityRepo;
@Service
public class ElectricityServiceImp implements ElectricityService {
@Autowired
public ElectricityRepo repo;
	@Override
	public Electricity saveRec(Electricity electricity) {
		int units=0;
		double total=0.0;
		units= electricity.getcReading()-electricity.getpReading();
		electricity.setUnits(units);
		
		if (units<300) {
			total=units*1.75;
		}
		else if (units>=300 && units<500) {
			total=units*2.75;
		}
		else if (units>500) {
			total=units*3.75;
		}
		electricity.setTotalBill(total);
		Electricity e = repo.save(electricity);
		return e;
	}
	@Override
	public Electricity getOneRec(int cId) {
		Electricity rec= repo.findById(cId).get();
		return rec;
	}
	@Override
	public List<Electricity> getAll() {
		List<Electricity> all=repo.findAll();
		return all;
	}
	@Override
	public Electricity update(Electricity electricity, int cId) {
		Electricity oldRec =repo.findById(cId).get();
		oldRec.setcReading(electricity.getcReading());
		oldRec.setpReading(electricity.getpReading());
		oldRec.setcName(electricity.getcName());
		
		int units=0;
		double total=0.0;
		units=electricity.getcReading()-electricity.getpReading();
		electricity.setUnits(units);
		
		if (units<300) {
			total=units*1.75;
		}
		else if (units>=300 && units<500) {
			total=units*2.75;
		}
		else if (units>500) {
			total=units*3.75;
		}
		electricity.setTotalBill(total);
		Electricity e =repo.save(oldRec);
		return e;
	}
	@Override
	public void deleteRec(int cId) {
		repo.deleteById(cId);
	
	}

}
