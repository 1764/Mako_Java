package org.usfirst.frc.team1763.robot;

import edu.wpi.first.wpilibj.Talon;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	
	//Left Drive Motor ports
	public static final int LEFT_GEARBOX_FRONT_MOTOR = 1;
	public static final int LEFT_GEARBOX_BACK_MOTOR = 3;
	
	// Right Drive Motor ports
	public static final int RIGHT_GEARBOX_FRONT_MOTOR = 0;
	public static final int RIGHT_GEARBOX_BACK_MOTOR = 2;
	
	// Shooter assembly
	public static final int INTAKE_SPINDLE = 6;
	public static final int FLYWHEEL = 4;
}
