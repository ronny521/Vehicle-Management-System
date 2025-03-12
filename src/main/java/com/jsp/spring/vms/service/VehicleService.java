package com.jsp.spring.vms.service;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.jsp.spring.vms.controller.VehicleController;
import com.jsp.spring.vms.entity.Vehicle;
import com.jsp.spring.vms.repository.VehicleRepository;

@Service
public class VehicleService {

	@Autowired
	private VehicleRepository vehicleRepository;

	public ModelAndView addVehicle(Vehicle vehicle)
	{
		//Resolving the request- saving the Vehicle object.
		vehicleRepository.addVehicle(vehicle);

		//Generating response - Redirecting back to dashboard
		ModelAndView mav = new ModelAndView();
		mav.setViewName("index.jsp");
		return mav;
	}

	public ModelAndView displayVehicle()
	{
		List<Vehicle> vehicles = vehicleRepository.displayVehicle();
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("vehicleList",vehicles);
		mav.setViewName("displayVehicle.jsp");
		
		return mav;
	}
	
	public ModelAndView findVehicleById(int vehicleId)
	{
		Vehicle vehicle = vehicleRepository.findVehicleById(vehicleId);
		ModelAndView mav = new ModelAndView();
		mav.addObject("vehicleobj",vehicle);
		mav.setViewName("updateVehicle.jsp");
		
		return mav;
	}
	
	public ModelAndView updateVehicle(Vehicle vehicle)
	{
		vehicleRepository.updateVehicle(vehicle);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:display-vehicle");
		return mav;
	}
	
	public ModelAndView deleteVehicle(int vehicleId)
	{
		vehicleRepository.deleteVehicle(vehicleId);
		
		ModelAndView mav = new ModelAndView();
		mav.setViewName("redirect:display-vehicle");
		return mav;
	}
}
