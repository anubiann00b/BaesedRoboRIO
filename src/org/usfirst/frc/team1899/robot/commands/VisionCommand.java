package org.usfirst.frc.team1899.robot.commands;

import edu.wpi.first.wpilibj.CameraServer;

public class VisionCommand extends CommandBase {
	
    public VisionCommand() {
    	requires(visionSubsystem);
    }
    
	@Override
	protected void initialize() {
		CameraServer server = CameraServer.getInstance();
        server.setQuality(50);
        server.startAutomaticCapture("cam0");
	}

	@Override
	protected void execute() {
		
	}

	@Override
	protected boolean isFinished() {
		return false;
	}

	@Override
	protected void end() {
	}

	@Override
	protected void interrupted() {
		
	}
}
