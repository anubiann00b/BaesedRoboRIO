package org.usfirst.frc.team1899.robot.subsystems;

import org.usfirst.frc.team1899.robot.RobotMap;
import org.usfirst.frc.team1899.robot.commands.drive.DriveCommand;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveSubsystem extends Subsystem {
    
    SpeedController right1 = new Talon(RobotMap.MOTOR_RIGHT_1);
    SpeedController left1 = new Talon(RobotMap.MOTOR_LEFT_1);
    
    public void initDefaultCommand() {
        setDefaultCommand(new DriveCommand());
    }
    
    public void setTankDrive(double l, double r) {
        left1.set(l);
        right1.set(r);
    }
    
    public void setArcadeDrive(double drive, double turn) {
        setTankDrive(drive+turn, drive-turn);
    }
}