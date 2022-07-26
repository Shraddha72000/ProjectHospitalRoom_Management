package com.example.HospitalRoomManagement.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="HospitalRoom")
public class HospitalRoom {
	@Id
	private int pregno;
	private String pname;
	private int pbedno;
	private double pbill;
	private String pmedicines;
	public HospitalRoom() {
		super();
	}

	public HospitalRoom(int pregno, String pname, int pbedno, double pbill, String pmedicines) {
		super();
		this.pregno = pregno;
		this.pname = pname;
		this.pbedno = pbedno;
		this.pbill = pbill;
		this.pmedicines = pmedicines;
		
	}
	
	public int getPregno() {
		return pregno;
	}

	public void setPregno(int pregno) {
		this.pregno = pregno;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public int getPbedno() {
		return pbedno;
	}

	public void setPbedno(int pbedno) {
		this.pbedno = pbedno;
	}

	public double getPbill() {
		return pbill;
	}

	public void setPbill(double pbill) {
		this.pbill = pbill;
	}

	public String getPmedicines() {
		return pmedicines;
	}

	public void setPmedicines(String pmedicines) {
		this.pmedicines = pmedicines;
	}
	

	@Override
	public String toString() {
		return "HospitalRoom [pregno=" + pregno + ", pname=" + pname + ", pbedno=" + pbedno + ", pbill=" + pbill
				+ ", pmedicines=" + pmedicines +"]";
	}
	
	
	
	

}
