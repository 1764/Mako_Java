package org.usfirst.frc.team1763.robot.subsystems;

import org.usfirst.frc.team1763.robot.RobotMap;
import org.usfirst.frc.team1763.robot.commands.IntakeWithSpindle;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;


/**
 *
 */
public class Spindle extends Subsystem {
	private SpeedController spindleMotor;
	
	public Spindle() {
		this.spindleMotor = new Talon(RobotMap.INTAKE_SPINDLE);
	}
	
	public void setSpeed(double speed) {
		this.spindleMotor.set(speed);
	}

    public void initDefaultCommand() {
    }
}

