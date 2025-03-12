package com.jsp.spring.vms.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.jsp.spring.vms.entity.Vehicle;

@Repository
public class VehicleRepository {
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("mysql-config");
	
	public void addVehicle(Vehicle vehicle)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.persist(vehicle);
		
		et.commit();
		em.close();
	}
	
	public List<Vehicle> displayVehicle()
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		CriteriaBuilder cb = em.getCriteriaBuilder();
		CriteriaQuery<Vehicle> cq = cb.createQuery(Vehicle.class);
		Root<Vehicle> root = cq.from(Vehicle.class);
		
		Query query = em.createQuery(cq);
		List<Vehicle> vehicles = query.getResultList();
		
		et.commit();
		em.close();
		return vehicles;
	}
	
	public Vehicle findVehicleById(int vehicleId)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Vehicle vehicle = em.find(Vehicle.class, vehicleId);
		
		et.commit();
		em.close();
		
		return vehicle;
	}
	
	public void updateVehicle(Vehicle vehicle)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		em.merge(vehicle);
		
		et.commit();
		em.close();
	}
	
	public void deleteVehicle(int vehicleId)
	{
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();
		
		Vehicle vehicle = em.find(Vehicle.class, vehicleId);
		em.remove(vehicle);
		
		et.commit();
		em.close();
	}
}
