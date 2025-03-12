package com.jsp.spring.vms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.spring.vms.entity.Vehicle;
import com.jsp.spring.vms.service.VehicleService;

@Controller
public class VehicleController {
		@Autowired
		private VehicleService vehicleService;
		
		@RequestMapping(value="/add-vehicle" , method =RequestMethod.POST)
		public ModelAndView addVehicle(Vehicle vehicle)
		{
			return vehicleService.addVehicle(vehicle);
		}
		
		@RequestMapping(value = "/display-vehicle")
		public ModelAndView displayVehicle()
		{
			return vehicleService.displayVehicle();
		}
		
		@RequestMapping(value = "/find-vehicle-by-Id")
		public ModelAndView findVehicleById(int vehicleId)
		{
			return vehicleService.findVehicleById(vehicleId);
		}
		
		@RequestMapping(value = "/save-updated-vehicle",method =RequestMethod.POST)
		public ModelAndView updateVehicle(Vehicle vehicle)
		{
			return vehicleService.updateVehicle(vehicle);
		}
		
		@RequestMapping(value = "/delete-vehicle")
		public ModelAndView deleteVehicle(int vehicleId)
		{
			return vehicleService.deleteVehicle(vehicleId);
		}
}
