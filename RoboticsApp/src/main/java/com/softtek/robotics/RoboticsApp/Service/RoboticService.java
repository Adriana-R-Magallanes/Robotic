package com.softtek.robotics.RoboticsApp.Service;

import java.awt.Robot;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.softtek.robotics.RoboticsApp.Entity.Robotic;
import com.softtek.robotics.RoboticsApp.Repository.RoboticRepository;

@Service
public class RoboticService {
	private RoboticRepository roboticRepository;

	@Autowired
	public RoboticService(RoboticRepository roboticRepository) {
		this.roboticRepository = roboticRepository;
	}
	
	public Robot createRobot(Robotic control) {
		return roboticRepository.save(control);
	}
	
	 public List<Robotic> getAllProducts() {
	        List<Robotic> list = new ArrayList<Robotic>();
	        roboticRepository.findAll().forEach(e -> list.addAll((Collection<? extends Robotic>) e));
	        return list;
	    }
	
	
	

	public void createRobot(String string) {
		
		
	}

	public Optional<Robotic> findByUserName(String username) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<Robotic> getAllRobot() {
		// TODO Auto-generated method stub
		return null;
	}
}