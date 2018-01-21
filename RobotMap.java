package org.usfirst.frc.team2906.robot;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class RobotMap {
	
	public static DifferentialDrive driveWC;
	public static SpeedControllerGroup m_right;
	public static SpeedControllerGroup m_left;
	public static WPI_TalonSRX Bob;
	public static WPI_TalonSRX Dave;
	public static WPI_TalonSRX Susan;
	public static WPI_TalonSRX Taylor;
	
	
	public static void init() {
		Bob = new WPI_TalonSRX(4);
		Dave = new WPI_TalonSRX(1);
		Susan = new WPI_TalonSRX(3);
		Taylor = new WPI_TalonSRX(2);
		
		Taylor.follow(Dave);
		Susan.follow(Bob);
		
		//m_right = new SpeedControllerGroup(Bob, Susan);
		//m_left = new SpeedControllerGroup(Dave, Taylor);
		
		driveWC = new DifferentialDrive(Bob, Susan);
	}
}