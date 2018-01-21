package org.usfirst.frc.team2906.robot.subsystems;

import org.usfirst.frc.team2906.robot.Robot;
import org.usfirst.frc.team2906.robot.RobotMap;
import org.usfirst.frc.team2906.robot.commands.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

/**
 *
 */
public class Frank extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private final DifferentialDrive driveWC = RobotMap.driveWC;
		
		//SpeedControllerGroup left = RobotMap.m_left;
		//SpeedControllerGroup right = RobotMap.m_right;
	
		WPI_TalonSRX left = RobotMap.Bob;
		WPI_TalonSRX right = RobotMap.Dave;
		
		public void drive(double RMotor, double LMotor) {
			right.set(RMotor);
			left.set(LMotor);
		}
		
		public void stop() {
			left.set(0);
			right.set(0);
		}
		
		/*public void arcadeDrive(double xSpeed, double zRotate) {
			driveWC.arcadeDrive(xSpeed, zRotate);
		}*/
		
		public void drive() {
			left.set(.25);
			right.set(.25);
		}
		
		
		public void initDefaultCommand() {
			//setDefaultCommand(new DriveWithJoysticksArcade());
			//setDefaultCommand(newDriveWithJpysticksTank());
			//setDefaultCommand(new DriveWithJoysticksMirror());
			setDefaultCommand(new Drive());
			
		}
}