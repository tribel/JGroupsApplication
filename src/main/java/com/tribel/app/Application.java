package com.tribel.app;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

import com.tribel.aircraft.Aircraft;
import com.tribel.aircraft.Airplane;
import com.tribel.aircraft.AirplaneType;
import com.tribel.aircraft.ControlCenter;
import com.tribel.aircraft.HelicopType;
import com.tribel.aircraft.Helicopter;

import nodes.AircraftNode;
import nodes.ControlCenterNode;



public class Application{
		
	static {
		System.setProperty("java.net.preferIPv6Stack" , "false");
 		System.setProperty("java.net.preferIPv4Stack" , "true");
	}
	
	public static final double DELTA = 0.5;

 	public static void main(String[] args) throws Exception{
 		
 		ControlCenterNode controlCenterNode = new ControlCenterNode("AircraftCluster");
 		AircraftNode helicopterNode = new AircraftNode(controlCenterNode, "AircraftCluster");
 		AircraftNode planeNode = new AircraftNode(controlCenterNode, "AircraftCluster");
 		
 	 		
 		ArrayList<Aircraft> aircraftList = new ArrayList<>(4);
 		
 		aircraftList.add(new Helicopter(helicopterNode, HelicopType.MI17, 1, 50.4546600, 50.4546600, 2000, 120));
 		aircraftList.add(new Helicopter(helicopterNode, HelicopType.MI2, 2, 40.7142700, -74.0059700, 1000, 60));
 		aircraftList.add(new Airplane(planeNode, AirplaneType.B777, 3, 55.7522200, 37.6155600, 10000, 150));
 		aircraftList.add(new Airplane(planeNode, AirplaneType.A300, 4, 32.8751900, 13.1874600, 50000, 70));
 			
 		ControlCenter center = new ControlCenter(aircraftList);
 		center.setNode(controlCenterNode);

 		
 		Timer timer = new Timer();
 		timer.schedule(new TimerTask() {
			
			@Override
			public void run() {
				for(Aircraft a: aircraftList) {
					a.setLatitude(a.getLatitude() + DELTA);
					a.setLongitude(a.getLongitude() + DELTA);
				}
				
			}
		}, 0, 10000);
 	}

}
