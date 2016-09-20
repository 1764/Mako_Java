package org.usfirst.frc.team1763.robot.commands;

import org.usfirst.frc.team1763.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class IntakeWithSpindle extends Command {

	private double speed;
    public IntakeWithSpindle(double speed) {
    	requires(Robot.spindle);
    	this.speed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.spindle.setSpeed(speed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.spindle.setSpeed(0);
    }

    protected void interrupted() {
    	Robot.spindle.setSpeed(0);
    }
}
