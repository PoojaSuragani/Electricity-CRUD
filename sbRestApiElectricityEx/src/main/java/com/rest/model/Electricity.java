package com.rest.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Electricity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int cId;
	private String cName;
	private int cReading;
	private int pReading;
	private int units;
	private double totalBill;
	
	protected Electricity() {
		super();
	}
	protected Electricity(int cId, String cName, int cReading, int pReading, int units, int totalBill) {
		super();
		this.cId = cId;
		this.cName = cName;
		this.cReading = cReading;
		this.pReading = pReading;
		this.units = units;
		this.totalBill = totalBill;
	}
	public int getcId() {
		return cId;
	}
	public void setcId(int cId) {
		this.cId = cId;
	}
	public String getcName() {
		return cName;
	}
	public void setcName(String cName) {
		this.cName = cName;
	}
	public int getcReading() {
		return cReading;
	}
	public void setcReading(int cReading) {
		this.cReading = cReading;
	}
	public int getpReading() {
		return pReading;
	}
	public void setpReading(int pReading) {
		this.pReading = pReading;
	}
	public int getUnits() {
		return units;
	}
	public void setUnits(int units) {
		this.units = units;
	}
	public double getTotalBill() {
		return totalBill;
	}
	public void setTotalBill(double total) {
		this.totalBill = total;
	}
	@Override
	public String toString() {
		return "Electricity [cId=" + cId + ", cName=" + cName + ", cReading=" + cReading + ", pReading=" + pReading
				+ ", units=" + units + ", totalBill=" + totalBill + "]";
	}
	

}
