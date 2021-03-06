package org.usfirst.frc.team1763.robot;

import org.usfirst.frc.team1763.robot.commands.IntakeWithSpindle;
import org.usfirst.frc.team1763.robot.commands.Shoot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    //// CREATING BUTTONS
    // One type of button is a joystick button which is any button on a joystick.
    // You create one by telling it which joystick it's on and which button
    // number it is.
    // Joystick stick = new Joystick(port);
    // Button button = new JoystickButton(stick, buttonNumber);
    
    // There are a few additional built in buttons you can use. Additionally,
    // by subclassing Button you can create custom triggers and bind those to
    // commands the same as any other Button.
    
    //// TRIGGERING COMMANDS WITH BUTTONS
    // Once you have a button, it's trivial to bind it to a button in one of
    // three ways:
    
    // Start the command when the button is pressed and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenPressed(new ExampleCommand());
    
    // Run the command while the button is being held down and interrupt it once
    // the button is released.
    // button.whileHeld(new ExampleCommand());
    
    // Start the command when the button is released  and let it run the command
    // until it is finished as determined by it's isFinished method.
    // button.whenReleased(new ExampleCommand());
	public static final int LOGITECH_EXTREME3D_AXIS_X = 0;
	public static final int LOGITECH_EXTREME3D_AXIS_Y = 1;
	public static final int LOGITECH_EXTREME3D_AXIS_Z = 2;
	public static final int LOGITECH_EXTREME3D_AXIS_SLIDER = 3;
	public static final int LOGITECH_EXTREME3D_BUTTON_TRIGGER = 1;
	public static final int LOGITECH_EXTREME3D_BUTTON_THUMB = 2;

	public static final int LOGITECH_F510_AXIS_LEFT_STICK_X = 0;
	public static final int LOGITECH_F510_AXIS_LEFT_STICK_Y = 1;
	public static final int LOGITECH_F510_AXIS_RIGHT_STICK_X = 4;
	public static final int LOGITECH_F510_AXIS_RIGHT_STICK_Y = 5;
	public static final int LOGITECH_F510_AXIS_LEFT_TRIGGER = 2;
	public static final int LOGITECH_F510_AXIS_RIGHT_TRIGGER = 3;
	public static final int LOGITECH_F510_BUTTON_A = 1;
	public static final int LOGITECH_F510_BUTTON_B = 2;
	public static final int LOGITECH_F510_BUTTON_X = 3;
	public static final int LOGITECH_F510_BUTTON_Y = 4;
	public static final int LOGITECH_F510_BUTTON_LEFT_BUMPER = 5;
	public static final int LOGITECH_F510_BUTTON_RIGHT_BUMPER = 6;
	public static final int LOGITECH_F510_BUTTON_BACK = 7;
	public static final int LOGITECH_F510_BUTTON_SELECT = 8;
	public static final int LOGITECH_F510_BUTTON_LEFT_CLICK = 9;
	public static final int LOGITECH_F510_BUTTON_RIGHT_CLICK = 10;
	
	public Joystick driveJoy = new Joystick(0);
	public Joystick copilotJoy = new Joystick(1);
	
	public JoystickButton shootMediumButton = new JoystickButton(copilotJoy, LOGITECH_F510_BUTTON_B);
	public JoystickButton shoot_far_button = new JoystickButton(copilotJoy, LOGITECH_F510_BUTTON_A);
	
	public JoystickButton spindleIntakeButton = new JoystickButton(copilotJoy, LOGITECH_F510_BUTTON_LEFT_BUMPER);
	public JoystickButton spindleOutButton = new JoystickButton(copilotJoy, LOGITECH_F510_BUTTON_RIGHT_BUMPER);
	
	public OI() {
		this.spindleIntakeButton.whileHeld(new IntakeWithSpindle(1));
		this.spindleOutButton.whileHeld(new IntakeWithSpindle(-1));
		this.shootMediumButton.whileHeld(new Shoot(-1));
	}
}

