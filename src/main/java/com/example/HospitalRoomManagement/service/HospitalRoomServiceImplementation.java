package com.example.HospitalRoomManagement.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.HospitalRoomManagement.dao.HospitalRoomRepo;
import com.example.HospitalRoomManagement.entity.HospitalRoom;
import com.example.HospitalRoomManagement.exception.PatientNotFoundException;


@Service
public class HospitalRoomServiceImplementation implements HospitalRoomService {
	@Autowired
	private HospitalRoomRepo hrepo;
	
	@Override
	public String addPatient(HospitalRoom h) {
		hrepo.save(h);
		return "Patient Added Successfully...";
	}

	@Override
	public  List<HospitalRoom> viewPatients() {
		// TODO Auto-generated method stub
		return (List<HospitalRoom>)hrepo.findAll();
	}

	@Override
	public HospitalRoom viewPatient(int pregno) {
		try
		{
			HospitalRoom h = hrepo.findById(pregno).orElseThrow(PatientNotFoundException::new);
			return h;
		}
		catch(PatientNotFoundException e)
		{
			return null;
		}
	}
		

	@Override
	public String updatePatient(HospitalRoom h) {
		HospitalRoom h1 = hrepo.findById(h.getPregno()).orElse(null);
		if(h1!=null)
		{
			hrepo.delete(h1);
		}
		hrepo.save(h);
		return "Patient Updated";
	}

	@Override
	public String deletePatient(int pregno) {
		try
		{
			HospitalRoom h1 = hrepo.findById(pregno).orElse(null);
			if(h1!=null)
			{
				hrepo.delete(h1);
				return null;
			}
			else
			{
				throw new PatientNotFoundException();
			}
		}
		  catch(PatientNotFoundException e)
		{
			  return e.toString();
		}
		
	}	 
}
