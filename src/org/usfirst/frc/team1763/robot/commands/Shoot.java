package org.usfirst.frc.team1763.robot.commands;

import org.usfirst.frc.team1763.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class Shoot extends Command {

	private double speed;
    public Shoot(double speed) {
    	requires(Robot.flywheel);
    	this.speed = speed;
    }

    protected void initialize() {
    }

    protected void execute() {
    	Robot.flywheel.setSpeed(speed);
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    	Robot.flywheel.setSpeed(0);
    }

    protected void interrupted() {
    	Robot.flywheel.setSpeed(0);
    }
}
