package org.usfirst.frc.team1899.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
    
    private static final int JOYSTICK_PORT = 0;
    
    public static final int LEFT_X = 0;
    public static final int LEFT_Y = 1;
    public static final int LEFT_TRIGGER = 2;
    public static final int RIGHT_TRIGGER = 3;
    public static final int RIGHT_X = 4;
    public static final int RIGHT_Y = 5;
    
    public static final int BUTTON_A = 1;
    public static final int BUTTON_B = 2;
    public static final int BUTTON_X = 3;
    public static final int BUTTON_Y = 4;
    public static final int BUTTON_LB = 5;
    public static final int BUTTON_RB = 6;
    public static final int BUTTON_BACK = 7;
    public static final int BUTTON_START = 8;
    public static final int BUTTON_L3 = 9;
    public static final int BUTTON_R3 = 10;
    
    private final Joystick joystick;
    
    public OI() {
        joystick = new Joystick(JOYSTICK_PORT);
    }
    
    public double getThrottle() {
        return joystick.getX();
    }
    
    public double getTwist() {
        return joystick.getY();
    }
}

