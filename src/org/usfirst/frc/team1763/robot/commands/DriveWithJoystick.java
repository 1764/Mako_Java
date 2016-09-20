package org.usfirst.frc.team1763.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import static org.usfirst.frc.team1763.robot.Robot.*;

import org.usfirst.frc.team1763.robot.Robot;;

/**
 *
 */
public class DriveWithJoystick extends Command {

    public DriveWithJoystick() {
    	requires(driveTrain);
    }

    protected void initialize() {
    }

    protected void execute() {
    	double y = oi.driveJoy.getY(); // Linear Speed
    	double z = oi.driveJoy.getZ(); // Rotational Speed
    	
    	driveTrain.setLeftSpeed(y+z);  	// Combine rotation and linear speed 
    	driveTrain.setRightSpeed(-y+z);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
