package com.softtek.robotics.RoboticsApp;

import java.awt.Robot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.softtek.robotics.RoboticsApp.Entity.Robotic;
import com.softtek.robotics.RoboticsApp.Service.RoboticService;

@SpringBootApplication
public class RoboticsAppApplication implements CommandLineRunner{
	
	
	@Autowired
	RoboticService roboticService;

	public static void main(String[] args) {
		SpringApplication.run(RoboticsAppApplication.class, args);
	}

		
		@Override
		public void run (String... args) throws Exception {
			Robotic Ojos = new Robotic();
			Ojos.setID(1);
			Ojos.setRobot("Ojos Robot");
			Ojos.setDescripcion("Ama los sistemas eco friendly");
			Ojos.setPrecio(1500);
				
			Robotic Ruedas = new Robotic();
			Ruedas.setID(2);
			Ruedas.setRobot("Ruedas Robot");
			Ruedas.setDescripcion("Ama los sistemas eco friendly");
			Ruedas.setPrecio(1700);
			
			Robotic Ninja = new Robotic();
			Ninja.setID(3);
			Ninja.setRobot("Ninja Robot");
			Ninja.setDescripcion("Ama los sistemas eco friendly");
			Ninja.setPrecio(1900);
			
			Robotic Control = new Robotic();
			Control.setID(1);
			Control.setRobot("Control Robot");
			Control.setDescripcion("Ama los sistemas eco friendly");
			Control.setPrecio(2000);
			
			
			
			roboticService.createRobot(Ojos);
			roboticService.createRobot(Ruedas);
			roboticService.createRobot(Ninja);
			roboticService.createRobot(Control);
			
		}
	
	}

	
