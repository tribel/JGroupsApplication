package com.tribel.nodes;

public class Airplane extends Aircraft<AirPlaneType>{

	
	public Airplane() {
	}

	public Airplane(AirPlaneType t, int number, double latitude,
			double longitude, double altitude, double course) {
		
		super(t, number, latitude, longitude, altitude, course);		
	}


}
