package org.usfirst.frc.team1899.robot.commands;

import org.usfirst.frc.team1899.robot.OI;
import org.usfirst.frc.team1899.robot.subsystems.DriveSubsystem;
import org.usfirst.frc.team1899.robot.subsystems.VisionSubsystem;

import edu.wpi.first.wpilibj.command.Command;

/**
 * The base for all commands. All atomic commands should subclass CommandBase.
 * CommandBase stores creates and stores each control system. To access a
 * subsystem elsewhere in your code in your code use CommandBase.exampleSubsystem
 */
public abstract class CommandBase extends Command {

    public static OI oi;
    public static DriveSubsystem driveSubsystem;
    public static VisionSubsystem visionSubsystem;
    
    public static void init() {
        driveSubsystem = new DriveSubsystem();
        visionSubsystem = new VisionSubsystem();
        oi = new OI();
    }

    public CommandBase(String name) {
        super(name);
    }

    public CommandBase() {
        super();
    }
}
