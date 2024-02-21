package com.rest.service;

import java.util.List;

import com.rest.model.Electricity;

public interface ElectricityService {
	public Electricity saveRec(Electricity electricity);
	public Electricity getOneRec(int cId);
	public List<Electricity> getAll();
	public Electricity update(Electricity electricity,int cId);
	public void deleteRec(int cId);
}
