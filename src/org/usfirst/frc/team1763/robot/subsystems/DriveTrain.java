package org.usfirst.frc.team1763.robot.subsystems;

import org.usfirst.frc.team1763.robot.RobotMap;
import org.usfirst.frc.team1763.robot.commands.DriveWithJoystick;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class DriveTrain extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	
	private SpeedController leftGearboxFrontMotor;
	private SpeedController leftGearboxBackMotor;
	private SpeedController rightGearboxFrontMotor;
	private SpeedController rightGearboxBackMotor;
	
	public DriveTrain() {
		this.leftGearboxFrontMotor = new Talon(RobotMap.LEFT_GEARBOX_FRONT_MOTOR);
		this.leftGearboxBackMotor = new Talon(RobotMap.LEFT_GEARBOX_BACK_MOTOR);
		
		this.rightGearboxFrontMotor = new Talon(RobotMap.RIGHT_GEARBOX_FRONT_MOTOR);
		this.rightGearboxBackMotor = new Talon(RobotMap.RIGHT_GEARBOX_BACK_MOTOR);
	}
	
	public void setLeftSpeed(double speed) {
		this.leftGearboxFrontMotor.set(speed);
		this.leftGearboxBackMotor.set(speed);
	}
	
	public void setRightSpeed(double speed) {
		this.rightGearboxFrontMotor.set(speed);
		this.rightGearboxBackMotor.set(speed);
	}

    public void initDefaultCommand() {
    	setDefaultCommand(new DriveWithJoystick());
    }
}

