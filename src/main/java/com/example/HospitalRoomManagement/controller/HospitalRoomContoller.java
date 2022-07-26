package com.example.HospitalRoomManagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.example.HospitalRoomManagement.entity.HospitalRoom;
import com.example.HospitalRoomManagement.service.HospitalRoomService;

@Controller
public class HospitalRoomContoller {
	
	@Autowired
	private HospitalRoomService hservice;
	
	@RequestMapping("Home")
	public String getHome() {
		return "hospitalHome.jsp";
	}
	
	@RequestMapping("addPatient")
	@ResponseBody
	public String addPatient(HospitalRoom h)
	{
		return hservice.addPatient(h);
	}
	
	@RequestMapping("viewPatient")
	@ResponseBody
	public ModelAndView viewPatient(int pregno)
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displayPatient.jsp");
		mvc.addObject("mode","single");
		
		HospitalRoom h= hservice.viewPatient(pregno);
		if(h!=null)
		{
			mvc.addObject("flag",true);
			mvc.addObject("result",h);
			return mvc;
		}
		mvc.addObject("flag",false);
		mvc.addObject("result",h);
		return mvc;
	}
	
	@RequestMapping("viewPatients")
	@ResponseBody
	public ModelAndView viewPatients()
	{
		ModelAndView mvc = new ModelAndView();
		mvc.setViewName("displayAccount.jsp");
		mvc.addObject("mode","list");
		mvc.addObject("result",hservice.viewPatients());
		return mvc;
	}
	
	@RequestMapping("deletePatient")
	@ResponseBody
	public String deletePatient( int pregno)
	{
		return hservice.deletePatient(pregno);
	}
	
	@RequestMapping("updatePatient")
	@ResponseBody
	public String updatePatient(HospitalRoom h)
	{
		return hservice.updatePatient(h);
	}
	
}
