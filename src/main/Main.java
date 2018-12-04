package main;

import com.studiohartman.jamepad.ControllerManager;
import com.studiohartman.jamepad.ControllerState;

public class Main {
	double leftStickY;
	double rightStickY;
	double leftTrig;
	double rightTrig;
	boolean A;
	boolean B;
	boolean X;
	boolean Y;

	public static void main(String[] args) {
		ControllerManager controllers = new ControllerManager();
		controllers.initSDLGamepad();
		ControllerState p1 = controllers.getState(0);
		while(true) {
			p1.
		}
	}

}
