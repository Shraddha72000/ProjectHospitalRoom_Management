package com.example.HospitalRoomManagement.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.HospitalRoomManagement.entity.HospitalRoom;

public interface HospitalRoomRepo extends JpaRepository<HospitalRoom, Integer>{

}
