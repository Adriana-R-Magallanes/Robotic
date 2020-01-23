package com.softtek.robotics.RoboticsApp.Repository;

import java.awt.Robot;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.softtek.robotics.RoboticsApp.Entity.Robotic;

public interface RoboticRepository extends CrudRepository<Robot, Long> {

	static Optional<Robotic> findByusername(String username) {
				return null;
	}

	Robot save(Robotic control);


}

