package org.usfirst.frc.team1899.robot.commands.drive;

import org.usfirst.frc.team1899.robot.commands.CommandBase;

public class DriveCommand extends CommandBase {
	
    public DriveCommand() {
        requires(driveSubsystem);
    }

    protected void initialize() {

    }

    protected void execute() {
        driveSubsystem.setArcadeDrive(oi.getThrottle(), oi.getTwist());
    }

    protected boolean isFinished() {
        return false;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
