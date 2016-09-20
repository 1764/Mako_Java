package org.usfirst.frc.team1763.robot.subsystems;

import org.usfirst.frc.team1763.robot.RobotMap;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Flywheel extends Subsystem {
	private SpeedController flywheelMotor;
	
	public Flywheel() {
		this.flywheelMotor = new Talon(RobotMap.FLYWHEEL);
	}
	
	public void setSpeed(double speed) {
		this.flywheelMotor.set(speed);
	}
	
    public void initDefaultCommand() {
    }
}

