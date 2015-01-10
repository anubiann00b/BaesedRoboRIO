package org.usfirst.frc.team1899.robot.subsystems;

import org.usfirst.frc.team1899.robot.commands.VisionCommand;

import edu.wpi.first.wpilibj.command.Subsystem;

public class VisionSubsystem extends Subsystem {

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new VisionCommand());
	}
}
