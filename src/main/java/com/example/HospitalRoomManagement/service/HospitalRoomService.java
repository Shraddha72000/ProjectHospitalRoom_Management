package com.example.HospitalRoomManagement.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.HospitalRoomManagement.entity.HospitalRoom;

@Service
public interface HospitalRoomService {
	
	String addPatient(HospitalRoom h);
	List<HospitalRoom> viewPatients();
	HospitalRoom viewPatient(int pregno);
	String updatePatient(HospitalRoom p);
	String deletePatient(int pregno);
}
