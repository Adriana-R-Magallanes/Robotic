package com.softtek.robotics.RoboticsApp.Controller;

import java.awt.Robot;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.softtek.robotics.RoboticsApp.Entity.Robotic;
import com.softtek.robotics.RoboticsApp.Service.RoboticService;

@RestController
public class RoboticController {	
	private RoboticService roboticService;
	
		@Value("${project.app.title}")
		private String appTitle;
					
			@Autowired
			public RoboticController(RoboticService roboticService) {
				this.roboticService = roboticService;
			}
			
			@GetMapping("/robots")
			public List<Robotic> getAllRobot(){
				return roboticService.getAllRobot();
			}
		}


