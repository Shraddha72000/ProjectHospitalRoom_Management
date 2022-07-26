package com.example.HospitalRoomManagement.dao;
import java.util.ArrayList;
import com.example.HospitalRoomManagement.entity.HospitalRoom;

public class HospitalRoomDao{	
private ArrayList<HospitalRoom> hlist = new ArrayList<HospitalRoom>();
	
	public String addPatient(HospitalRoom h) {
		hlist.add(h);
		return "Patient added Sucessfully....";
	}
	public HospitalRoom viewPatient(int pregno) {
		for(HospitalRoom h:hlist)
		{
			if(h.getPregno() == pregno)
			{
				return h;
			}
		}
		return null;
}
public ArrayList<HospitalRoom> viewPatients(){
	return hlist;
}
public String updatePatient(HospitalRoom h) {
	for(HospitalRoom h1:hlist) {
		if(h1.getPregno() == h.getPregno())
		{
			h1.setPregno(h.getPregno());
			h1.setPname(h.getPname());
			h1.setPbedno(h.getPbedno());
			h1.setPbill(h.getPbill());
			h1.setPmedicines(h.getPmedicines());
			return "Patient updated sucessfully...";
		}
	}
	hlist.add(h);
	return "Patient added Sucessfully";
}
public String deletePatient(int pregno) {
	for(int i=0;i<hlist.size();i++)
	{
		if(hlist.get(i).getPregno() == pregno)
		{
			hlist.remove(hlist.get(i));
			return "Patient deleted Successfully";
		}
	}
	return "Patient not found";
}
}
