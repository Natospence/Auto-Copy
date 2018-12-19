package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

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
	
	static int seconds = 15;
	static int ticksPerSecond = 50;
	static int ticks = seconds * ticksPerSecond;
	
	File csvFile;
	PrintWriter writer;
	static String writeDirectory = "";

	public static void main(String[] args) {
		try {
			PrintWriter writer = new PrintWriter(new File("C:/Users/natspence/Desktop/OUTPUT.txt"));
			
			ControllerManager controllers = new ControllerManager();
			controllers.initSDLGamepad();
			ControllerState p1;
			for(int i = 0; i<ticks; i++) {
				p1 = controllers.getState(0);
				float RSY = p1.rightStickY;
				float LSY = p1.leftStickY;
				
				String line = LSY + " X " + RSY;
				System.out.println(line);
				writer.println(line);
				
				try {
					Thread.sleep(20);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			writer.close();
		} catch (FileNotFoundException e1) {
			e1.printStackTrace();
		}

	}

}
