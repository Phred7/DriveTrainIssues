package org.usfirst.frc.team2906.robot;

import edu.wpi.first.wpilibj.Joystick;

public class OI {

	public Joystick joystick1;

	public OI (){
		joystick1=new Joystick(0);
	}
	

	public Joystick getJoystick1() {
		return joystick1;
	}

	public double getJoystick1X() {
		if (Math.abs(joystick1.getX())>0.05) {
			return -1* joystick1.getX();
		}
		else { 
			return 0.0;
		}
	}

	public double getJoystick1Y() { 
	
		if (Math.abs(joystick1.getY()) > 0.05) {
			return -1* joystick1.getY();
		}
		else {
			return 0.0;
		}
	}

	public double getJoystick1R() {
		if (Math.abs(joystick1.getRawAxis(2)) > 0.05) {
			return -1.0 * joystick1.getRawAxis(2);

		} else {
			return 0.0;
		}
	}
}